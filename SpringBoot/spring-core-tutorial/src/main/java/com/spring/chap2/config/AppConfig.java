package com.spring.chap2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.spring.chap2.data.repository.CustomerRepository;
import com.spring.chap2.data.repository.InventoryItemRepository;
import com.spring.chap2.data.repository.SalesOrderRepository;
import com.spring.chap2.service.InventoryService;
import com.spring.chap2.service.OrderService;
import com.spring.chap2.service.impl.InventoryServiceImpl;
import com.spring.chap2.service.impl.OrderServiceImpl;

@Configuration
@Import(DataConfig.class)
@PropertySource("classpath:/application.properties")

public class AppConfig {
	
	@Value("${greeting.text}")
	private String greetingText;
	@Value("${greeting.preamble}")
	private String greetingpreamble;
	public class Worker{
		String preamble;
		private String text;
		public Worker(String preamble,String text) {
			this.preamble=preamble;
			this.text = text;
			System.out.println("New Instance");
		}
		public void execute() {
			System.out.println(preamble+"\n"+text);
		}
	}
	@Bean
	@Scope("prototype")
	public Worker worker() {
		return new Worker(greetingpreamble,greetingText);
	}
	
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private InventoryItemRepository inventoryItemRepository;
	@Autowired
	private SalesOrderRepository salesOrderRepository;

	@Bean
	public OrderService orderService(InventoryService inventoryService, CustomerRepository customerRepository, SalesOrderRepository salesOrderRepository) {
		return new OrderServiceImpl(inventoryService, customerRepository, salesOrderRepository);
	}
	@Bean
	public InventoryService inventoryService(InventoryItemRepository inventoryItemRepository) {
		return new InventoryServiceImpl(inventoryItemRepository);
	}
	/*@Bean
	public InventoryItemRepository inventoryItemRepository() {
		return new InventoryItemRepository();
	}
	@Bean
	public CustomerRepository customerRepository() {
		return new CustomerRepository();
	}
	@Bean
	public SalesOrderRepository salesOrderRepository() {
		return new SalesOrderRepository();
	}*/
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderService orderService = context.getBean(OrderService.class);
		System.out.println(orderService==null?"NULL":"A OK");
		Worker worker = context.getBean(Worker.class);
		worker.execute();
		Worker worker1 = context.getBean(Worker.class);
		worker1.execute();
	}
}
