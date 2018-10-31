package com.spring.chap2.service.impl;

import java.util.Map;

import com.spring.chap2.data.repository.CustomerRepository;
import com.spring.chap2.data.repository.SalesOrderRepository;
import com.spring.chap2.model.Customer;
import com.spring.chap2.model.Order;
import com.spring.chap2.service.InventoryService;
import com.spring.chap2.service.OrderService;

public class OrderServiceImpl implements OrderService{

	private final InventoryService inventoryService;
	private final CustomerRepository customerRepository;
	private final SalesOrderRepository salesOrderRepository;
	
	public OrderServiceImpl(InventoryService inventoryService, CustomerRepository customerRepository, SalesOrderRepository salesOrderRepository) {
		this.inventoryService = inventoryService;
		this.customerRepository = customerRepository;
		this.salesOrderRepository = salesOrderRepository;
	}
	
	@Override
	public Order createOrder(Customer customer, Map<String, Long> items) {
		return null;
	}

	@Override
	public Order createOrder(String customerId, Map<String, Long> items) {
		return null;
	}

	@Override
	public Order getOrder(String orderId) {
		return null;
	}

}
