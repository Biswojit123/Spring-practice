package com.spring.depen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContainerClass1 {

	public static void main(String[] args) {

		// Create the container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\setter-injection-predefined-class\\spring-bean.xml");
		
		
		College college = (College) container.getBean("college1");
		System.out.println(college.getCollegeName());
		System.out.println(college.getDepartment());
		System.out.println(college.getStudent().getId());
		System.out.println(college.getStudent().getName());
		System.out.println(college.getStudent().getSubject());
		System.out.println(college.getStudent().getSubWithMarks());

	}

}
