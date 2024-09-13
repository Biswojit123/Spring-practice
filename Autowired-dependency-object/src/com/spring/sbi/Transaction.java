package com.spring.sbi;

import java.util.Date;

public class Transaction {
	//All transaction details
	private boolean isSuccess;
	private String transactionId;
	private Date date;
	private double amount;
	
	
	public Transaction() {
		super();
		System.out.println("Transaction Object created Successfully");
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Transaction [isSuccess=" + isSuccess + ", transactionId=" + transactionId + ", date=" + date
				+ ", amount=" + amount + "]";
	}
	
}
