package com.spring.chap2.service;

import java.util.Map;

import com.spring.chap2.model.Product;

public interface InventoryService {

	Map<Product, Long> getTotalInventoryOnHand();
	long getQuantityOnHand(String itemId);
	void adjustInventory(String itemId, long quantity);
}
