package com.spring.entity;

import org.springframework.stereotype.Component;


@Component("transaction2")
public class Transaction {
	private Integer transactionId;
	private String isSuccess;
	private Double price;
	
	public Transaction() {
		super();
		System.out.println("Transaction instantiated successfully");
	}
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public String getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
