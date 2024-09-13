package com.spring.dependency;

import java.util.List;

public class Orders {
	private String orderId;
	private String productName;
	private double totalPrice;
	private char foodType;
	private boolean isDelivery;
	private long mobileNum;
	private List<String> productAvialable;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(String orderId, String productName, double totalPrice, char foodType, boolean isDelivery,
			long mobileNum, List<String> productAvialable) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.totalPrice = totalPrice;
		this.foodType = foodType;
		this.isDelivery = isDelivery;
		this.mobileNum = mobileNum;
		this.productAvialable = productAvialable;
	}

	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public char getFoodType() {
		return foodType;
	}
	public void setFoodType(char foodType) {
		this.foodType = foodType;
	}
	public boolean isDelivery() {
		return isDelivery;
	}
	public void setIsDelivery(boolean isDelivery) {
		this.isDelivery = isDelivery;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public List<String> getProductAvialable() {
		return productAvialable;
	}
	public void setProductAvialable(List<String> productAvialable) {
		this.productAvialable = productAvialable;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", productName=" + productName + ", totalPrice=" + totalPrice
				+ ", foodType=" + foodType + ", isDelivery=" + isDelivery + ", mobileNum=" + mobileNum
				+ ", productAvialable=" + productAvialable + "]";
	}
	
	

	
}
