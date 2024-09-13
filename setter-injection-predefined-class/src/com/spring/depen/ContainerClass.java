package com.spring.depen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContainerClass {

	public static void main(String[] args) {
		// create the container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\setter-injection-predefined-class\\spring-bean.xml");
		
		//Now get Bean object
		Student stu = (Student) container.getBean("student1");
		//get the value from the student
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getSubject());
		System.out.println(stu.getSubWithMarks());
		

	}

}
