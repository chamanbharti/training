package com.spring.chap2.service;

import java.util.Map;

import com.spring.chap2.model.Customer;
import com.spring.chap2.model.Order;

public interface OrderService {

	Order createOrder(Customer customer, Map<String, Long> items);
	Order createOrder(String customerId, Map<String, Long> items);
	Order getOrder(String orderId);
}
