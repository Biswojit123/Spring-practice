package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.entity.Student;

public class TestClassMain {

	public static void main(String[] args) {
		// Get the Container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\Spring-Assignment-1\\web-spring-con.xml");
		
		//get the Bean object from the container
		Student student = (Student) container.getBean("student1");
		
		System.out.println(student);

	}

}
