package com.spring.bank;

public class Loan {
	//private member
	private SBIBank bankToGetLoan;
	private String loanName;
	private long amountProvide;
	
	//default constructor
	public Loan() {
		super();
		System.out.println("Default constructor call");
	}
	
	//Getter and Setter
	public SBIBank getBankToGetLoan() {
		return bankToGetLoan;
	}

	public void setBankToGetLoan(SBIBank bankToGetLoan) {
		this.bankToGetLoan = bankToGetLoan;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public long getAmountProvide() {
		return amountProvide;
	}

	public void setAmountProvide(long amountProvide) {
		this.amountProvide = amountProvide;
	}

	@Override
	public String toString() {
		return "Loan [bankToGetLoan=" + bankToGetLoan + ", loanName=" + loanName + ", amountProvide=" + amountProvide
				+ "]";
	}
	
	
	
}
