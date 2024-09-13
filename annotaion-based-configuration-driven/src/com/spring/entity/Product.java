package com.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private String productName;
	private Integer productId;
	private Double price;
	private Integer qat;
	
	public Product() {
		super();
		System.out.println("Product Instantiated....");
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQat() {
		return qat;
	}
	public void setQat(Integer qat) {
		this.qat = qat;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", price=" + price + ", qat=" + qat
				+ "]";
	}
	
	
}
