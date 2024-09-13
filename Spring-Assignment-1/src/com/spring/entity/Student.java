package com.spring.entity;

import java.util.Map;

//Bean Class
public class Student {
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSubAndMarks="
				+ studentSubAndMarks + "]";
	}
	//Private Member
	private Integer studentId;
	private String studentName;
	private Map<String,Integer> studentSubAndMarks;

	/*
	 * //0-parameter constructor public Student() { super();
	 * System.out.println("Student Instantiated successfully"); }
	 */
	
	
	public Student(Integer studentId, String studentName, Map<String, Integer> studentSubAndMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSubAndMarks = studentSubAndMarks;
		System.out.println("Throw the Constructor Dependecy injection Happen");
	}


	//Getter and Setter Method
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		System.out.println("studentId setter method call");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("studentName setter method call");
		this.studentName = studentName;
	}
	public Map<String, Integer> getStudentSubAndMarks() {
		return studentSubAndMarks;
	}
	public void setStudentSubAndMarks(Map<String, Integer> studentSubAndMarks) {
		System.out.println("student Sub and Marks setter method call");
		this.studentSubAndMarks = studentSubAndMarks;
	}
}
