package com.spring.entity;

//Bean class
public class Employee {
	//private member
	private String empName;
	private Double empSalary;
	private Integer empId;
	private Address empAddress;
	private Oraganisation empBelongOraganisation;
	//0-parameter constructor
	public Employee() {
		super();
		System.out.println("Employee is instantiated");
	}
	
	public Employee(String empName, Double empSalary, Integer empId, Address empAddress,
			Oraganisation empBelongOraganisation) {
		super();
		this.empName = empName;
		this.empSalary = empSalary;
		this.empId = empId;
		this.empAddress = empAddress;
		this.empBelongOraganisation = empBelongOraganisation;
	}

	//getter and setter
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("Employee setter injection call for set EmpName");
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		System.out.println("Employee setter injection call for set EmpSalary");
		this.empSalary = empSalary;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		System.out.println("Employee setter injection call for set EmpId");
		this.empId = empId;
	}
	public Address getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Address empAddress) {
		System.out.println("Employee setter injection call for set EmpAddress");
		this.empAddress = empAddress;
	}
	public Oraganisation getEmpBelongOraganisation() {
		return empBelongOraganisation;
	}
	public void setEmpBelongOraganisation(Oraganisation empBelongOraganisation) {
		System.out.println("Employee setter injection call for set oraganisation he belongs");
		this.empBelongOraganisation = empBelongOraganisation;
	}
	//ToString Method to print the object identifier
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", empId=" + empId + ", empAddress="
				+ empAddress + ", empBelongOraganisation=" + empBelongOraganisation + "]";
	}
	
	
}
