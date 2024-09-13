package com.spring.depen;

import java.util.Map;
import java.util.Set;

public class Student {
	//private field for encapsulation
	private String name;
	private int id;
	private Set<String> subject;
	private Map<String, Integer> subWithMarks;

	//Default constructor
	public Student() {
		super();
		System.out.println("Student object created Successfully");
	}
	
	//getter And Setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("set name setter injection call");
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("set Id setter injection call");
		this.id = id;
	}

	public Set<String> getSubject() {
		return subject;
	}

	public void setSubject(Set<String> subject) {
		System.out.println("set subject setter injection call");
		this.subject = subject;
	}

	public Map<String, Integer> getSubWithMarks() {
		return subWithMarks;
	}

	public void setSubWithMarks(Map<String, Integer> subWithMarks) {
		System.out.println("set subWithMark setter injection call");
		this.subWithMarks = subWithMarks;
	}

}
