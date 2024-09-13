package com.spring.entity;

//Beans class
public class Oraganisation {
	// private members
	private String oraganisationName;
	private Address oraganisationAddress;

	// 0-parameter Constructor
	public Oraganisation() {
		super();
		System.out.println("Oraganisation Object is Instantiated..");
	}
	

	public Oraganisation(String oraganisationName, Address oraganisationAddress) {
		super();
		this.oraganisationName = oraganisationName;
		this.oraganisationAddress = oraganisationAddress;
	}


	// Getter and setter method
	public String getOraganisationName() {
		return oraganisationName;
	}

	public void setOraganisationName(String oraganisationName) {
		System.out.println("Oraganisation setter injection call for set Oraganisation Name");
		this.oraganisationName = oraganisationName;
	}

	public Address getOraganisationAddress() {
		return oraganisationAddress;
	}

	public void setOraganisationAddress(Address oraganisationAddress) {
		System.out.println("Oraganisation setter injection call for set Oraganisation Address");
		this.oraganisationAddress = oraganisationAddress;
	}

	@Override
	public String toString() {
		return "Oraganisation [oraganisationName=" + oraganisationName + ", oraganisationAddress="
				+ oraganisationAddress + "]";
	}
	
	
}
