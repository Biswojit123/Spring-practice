package com.spring.dependency;

public class Employee {
	private String name;
	private int age;
	private double salary;

	public Employee() {
		super();
		System.out.println("Employee object created successfully!");
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName call by the ioc continer to inject name");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("setAge call by the ioc continer to inject age");
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("setSalary call by the ioc continer to inject salary");
		this.salary = salary;
	}

}
