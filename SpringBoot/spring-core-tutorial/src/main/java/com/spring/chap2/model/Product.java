package com.spring.chap2.model;

import java.math.BigDecimal;

public class Product {

	 	private String itemId;
	    private String name;
	    private BigDecimal cost;
	    private BigDecimal price;
	    private String sku;
	    
		public String getItemId() {
			return itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public BigDecimal getCost() {
			return cost;
		}
		public void setCost(BigDecimal cost) {
			this.cost = cost;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public String getSku() {
			return sku;
		}
		public void setSku(String sku) {
			this.sku = sku;
		}
}
