package com.spring.entity;


public class Address {
	//Get the private member
	private String city;
	private String state;
	private Integer pincode;
	//0-parameter constructor
	public Address() {
		super();
		System.out.println("Address is instantiated....");
	}
	
	
	public Address(String city, String state, Integer pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	//getter and setter
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("Address setter injection call for set City");
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("Address setter injection call for set State");
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		System.out.println("Address setter injection call for set Pincode");
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}	
	
	
}
