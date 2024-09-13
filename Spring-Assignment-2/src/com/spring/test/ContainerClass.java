package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.entity.Employee;

public class ContainerClass {
	// This is the main method
	public static void main(String[] args) {
		// Get the container object
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\Spring-Assignment-2\\web-spring1.xml");
		
		//get the Employee Object
		Employee employee = (Employee) container.getBean("employee");
		
		//Print the Employee object actually is created or not
		System.out.println(employee);
	}
}
