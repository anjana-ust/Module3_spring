package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
@Document
@Data
@NoArgsConstructor

public class Product {
	
	@Id
	
	private String _id;
	private String name;
	private String description;
	private BigDecimal Price;
	private int qty;
	
	/*
	 * public long getProductId() { return productid; } public void
	 * setProductId(long productId) { this.productid = productId; } public String
	 * getProductName() { return name; } public void setProductName(String
	 * productName) { this.name = productName; } public String getDescription() {
	 * return description; } public void setDescription(String description) {
	 * this.description = description; } public BigDecimal getPrice() { return
	 * Price; } public void setPrice(BigDecimal price) { this.Price = price; }
	 * public int getQty() { return qty; } public void setQty(int qty) { this.qty =
	 * qty; }
	 */

}
