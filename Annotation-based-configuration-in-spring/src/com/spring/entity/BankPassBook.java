package com.spring.entity;

public class BankPassBook {
	private Integer accountNumber;
	private String holderName;
	private String  IFSC;
	private String branch;
	//Default constructor
	public BankPassBook() {
		super();
		System.out.println("Bank passbook is instantiated");
	}
	//Getter and Setter
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
