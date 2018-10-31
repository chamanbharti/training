package com.spring.chap2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.chap2.data.repository.CustomerRepository;
import com.spring.chap2.data.repository.InventoryItemRepository;
import com.spring.chap2.data.repository.SalesOrderRepository;

@Configuration
public class DataConfig {

	@Bean
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
	}
}
