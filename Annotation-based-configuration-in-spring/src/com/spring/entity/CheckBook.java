package com.spring.entity;

public class CheckBook {
	private String name;
	private Integer account;
	private Double amount;
	private String signature;
	public CheckBook() {
		super();
		System.out.println("CheckPassBook Instatiated");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAccount() {
		return account;
	}
	public void setAccount(Integer account) {
		this.account = account;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
}