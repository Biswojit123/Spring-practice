package com.core.spring;

public class Employee {
	//private member
	private String name;
	private int age;
	private double salary;

	//default constructor
	public Employee() {
		super();
		System.out.println("Employee Object created Successfully");
	}
	//Getter and  Setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
