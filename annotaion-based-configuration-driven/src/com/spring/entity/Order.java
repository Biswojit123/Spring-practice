package com.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Order {
	private Integer orderId;
	private String orderName;
	private String orderStatus;
	private Double totalPrice;
	public Order() {
		super();
		System.out.println("Order Instantiated successfully");
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderStatus=" + orderStatus
				+ ", totalPrice=" + totalPrice + "]";
	}
}
