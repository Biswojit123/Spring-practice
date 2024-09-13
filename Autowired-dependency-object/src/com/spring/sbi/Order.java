package com.spring.sbi;

public class Order {
	// private member
	private Integer oredrId;
	private Product product;
	private Transaction transction;

	// default constructor
//	public Order() {
//		super();
//		System.out.println("Order Class is the Instantiated");
//	}

	// We have to declare the Parameter constructor for constructor injection
	public Order(Product product, Transaction transction) {
		super();
		this.product = product;
		this.transction = transction;
		System.out.println("Transaction and product object injected throw the constructor injection");
	}

	public Integer getOredrId() {
		return oredrId;
	}

	public void setOredrId(Integer oredrId) {
		this.oredrId = oredrId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		System.out.println("Product setter metehod call for injecting product object");
		this.product = product;
	}

	public Transaction getTransction() {
		return transction;
	}

	public void setTransction(Transaction transction) {
		System.out.println("Transaction setter method call for injecting Transaction object");
		this.transction = transction;
	}

	@Override
	public String toString() {
		return "Order [oredrId=" + oredrId + ", product=" + product + ", transction=" + transction + "]";
	}

}
