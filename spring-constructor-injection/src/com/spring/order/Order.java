package com.spring.order;

import java.util.List;
import java.util.Map;

public class Order {
	
	//Private member
	private String oderId;
	private String history;
	private List<String> product;
	private Map<Double,String> priceWithProduct;
	private int quantity;
	private boolean isOrderPlaced;
	
	//now create a parameter
	public Order(String oderId, String history, List<String> product, Map<Double, String> priceWithProduct,
			int quantity, boolean isOrderPlaced) {
		super();
		this.oderId = oderId;
		this.history = history;
		this.product = product;
		this.priceWithProduct = priceWithProduct;
		this.quantity = quantity;
		this.isOrderPlaced = isOrderPlaced;
		System.out.println("Call the Parameter constructor");
	} 
	
	public Order(List<String> product, Map<Double, String> priceWithProduct, int quantity) {
		super();
		this.product = product;
		this.priceWithProduct = priceWithProduct;
		this.quantity = quantity;
		System.out.println("3- parameter constructor call");
	}

	public Order() {
		super();
		System.out.println("Zero-parameter constructor call");
	}
	

	//we have to use the setter injection
	public String getOderId() {
		return oderId;
	}

	public void setOderId(String oderId) {
		System.out.println("Set orderId will call");
		this.oderId = oderId;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		System.out.println("Set history will call");
		this.history = history;
	}

	public List<String> getProduct() {
		return product;
	}

	public void setProduct(List<String> product) {
		System.out.println("Set product  will call");
		this.product = product;
	}

	public Map<Double, String> getPriceWithProduct() {
		return priceWithProduct;
	}

	public void setPriceWithProduct(Map<Double, String> priceWithProduct) {
		System.out.println("Set price with product will call");
		this.priceWithProduct = priceWithProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		System.out.println("Set quantity will call");
		this.quantity = quantity;
	}

	public boolean isOrderPlaced() {
		return isOrderPlaced;
	}

	public void setIsOrderPlaced(boolean isOrderPlaced) {
		System.out.println("Set order placed will call");
		this.isOrderPlaced = isOrderPlaced;
	}
	
}
