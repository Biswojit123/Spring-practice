package com.spring.bank;

import java.util.List;
import java.util.Map;

public class SBIBank {
	private String bankName;
	private String branch;
	private List<String> services;
	private Map<String,Long> lons;

	//Default constructor
	public SBIBank() {
		super();
		System.out.println("Default constructor created Successfully");
	}
	
	//Parameter-constructor
	
	public SBIBank(String bankName, String branch, List<String> services, Map<String, Long> lons) {
		super();
		this.bankName = bankName;
		this.branch = branch;
		this.services = services;
		this.lons = lons;
		System.out.println("Parameter constructor created successfully");
	}


	//Setter and getter 
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<String> getServices() {
		return services;
	}

	public void setServices(List<String> services) {
		this.services = services;
	}
	
	public Map<String, Long> getLons() {
		return lons;
	}

	public void setLons(Map<String, Long> lons) {
		this.lons = lons;
	}

	@Override
	public String toString() {
		return "SBIBank [bankName=" + bankName + ", branch=" + branch + ", services=" + services + ", lons=" + lons
				+ "]";
	}
	
	
}
