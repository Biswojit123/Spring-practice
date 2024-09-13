package com.spring.sbi;

public class Account {
	//private Method
	private String holderName;
	private Transaction transaction;
	private String status;
	private String toAccount;
	private Transaction transaction1;

	public Account() {
		super();
		System.out.println("Account object created successfully");
	}
	//Setter and getter Methods
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		System.out.println("Transaction injected via setter");
		this.transaction = transaction;
	}
	public Transaction getTransaction1() {
		return transaction1;
	}
	public void setTransaction1(Transaction transaction1) {
		System.out.println("Transaction injected via setter");
		this.transaction1 = transaction1;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getToAccount() {
		return toAccount;
	}
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
	@Override
	public String toString() {
		return "Account [holderName=" + holderName + ", transaction=" + transaction + ", status=" + status
				+ ", toAccount=" + toAccount + ", transaction1=" + transaction1 + "]";
	}
	
	
}
