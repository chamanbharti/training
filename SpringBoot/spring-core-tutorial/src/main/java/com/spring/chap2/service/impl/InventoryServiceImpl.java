package com.spring.chap2.service.impl;

import java.util.Map;

import com.spring.chap2.data.repository.InventoryItemRepository;
import com.spring.chap2.model.Product;
import com.spring.chap2.service.InventoryService;

public class InventoryServiceImpl implements InventoryService{

	private final InventoryItemRepository inventoryItemRepository;
	
	public InventoryServiceImpl(InventoryItemRepository inventoryItemRepository) {
		this.inventoryItemRepository = inventoryItemRepository;
	}
	
	@Override
	public Map<Product, Long> getTotalInventoryOnHand() {
		return null;
	}

	@Override
	public long getQuantityOnHand(String itemId) {
		return 0;
	}

	@Override
	public void adjustInventory(String itemId, long quantity) {
		
	}

}
