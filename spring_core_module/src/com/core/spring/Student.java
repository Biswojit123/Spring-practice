package com.core.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
	//private member
	private String studentName;
	private int studentId;
	private String address;
	
	//add zeroArgs Constructor
	public Student() {
		super();
		System.out.println("Student object created successfully!");
	}
	
	
	
}
