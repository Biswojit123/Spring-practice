package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DependencyInjectionPrimitiveType {

	public static void main(String[] args) {

		// Create the IOC Container.
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\spring_core_dependency_injection\\spring-bean.xml");
		
		//get the object from the container
		Employee emp = (Employee) container.getBean("employee");
		
		//print the all data of employee
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		
		//now  get the value from the container 
		Employee emp2 = (Employee) container.getBean("employee1");
		
		//print the all data of employee
		System.out.println(emp2.getName());
		System.out.println(emp2.getAge());
		System.out.println(emp2.getSalary());

	}

}
