package com.spring.sbi;

import java.util.List;

public class Product {
	private String productName;
	private List<String> productsName;
	private Double amount;

	public Product() {
		super();
		System.out.println("Product class instantiated");
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<String> getProductsName() {
		return productsName;
	}

	public void setProductsName(List<String> productsName) {
		this.productsName = productsName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productsName=" + productsName + ", amount=" + amount + "]";
	}

}
