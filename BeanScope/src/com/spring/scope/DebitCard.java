package com.spring.scope;

public class DebitCard {
	private String dabitCardNum;
	private Integer cvv;
	private String expireDate;
	private String name;
	
	//Setter and Getter injection
	public String getDabitCardNum() {
		return dabitCardNum;
	}
	public void setDabitCardNum(String dabitCardNum) {
		this.dabitCardNum = dabitCardNum;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

}
