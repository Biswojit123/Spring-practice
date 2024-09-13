package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.entity.Student;

public class TestMain {

	public static void main(String[] args) {
		//Get the Container Object
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\Spring-Assignment-1\\web-spring.xml");
		
		//get the Bean Object from the Container
		Student student = (Student)container.getBean("student");
		
		//print the object actually setter injection happen or not
		System.out.println(student);
	}

}
