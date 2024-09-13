package com.spring.bank;

public class Holder {
	private String nameHolder;
	private Loan loan;
	private long accountNumber;
	private String idProof;
	
	//Default constructor
	public Holder() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameter-Constructor
	public Holder(String nameHolder, Loan loan, long accountNumber, String idProof) {
		super();
		this.nameHolder = nameHolder;
		this.loan = loan;
		this.accountNumber = accountNumber;
		this.idProof = idProof;
	}

	//Getter and Setter
	public String getNameHolder() {
		return nameHolder;
	}

	public void setNameHolder(String nameHolder) {
		this.nameHolder = nameHolder;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	@Override
	public String toString() {
		return "Holder [nameHolder=" + nameHolder + ", loan=" + loan + ", accountNumber=" + accountNumber + ", idProof="
				+ idProof + "]";
	}
	
	
	
}
