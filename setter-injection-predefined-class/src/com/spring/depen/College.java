package com.spring.depen;

import java.util.Set;

public class College {
	
	private String collegeName;
	private Student student;
	private Set<String> department;
	
	public College() {
		super();
		System.out.println("College object is created successfully");
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Set<String> getDepartment() {
		return department;
	}
	public void setDepartment(Set<String> department) {
		this.department = department;
	}
	
	
}
