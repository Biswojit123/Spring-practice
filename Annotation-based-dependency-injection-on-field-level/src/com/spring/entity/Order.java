package com.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order {
	private Integer productId;
	private Double price;
	//field level auto-wired 
	@Qualifier("transaction2")
	@Autowired
	private Transaction transaction1;
	
	public Transaction getTransaction1() {
		return transaction1;
	}
	public void setTransaction1(Transaction transaction1) {
		this.transaction1 = transaction1;
	}
	public Order() {
		super();
		System.out.println("Order object instantiated");
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
	
	
}
