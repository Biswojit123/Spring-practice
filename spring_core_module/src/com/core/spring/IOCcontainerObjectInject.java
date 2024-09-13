package com.core.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCcontainerObjectInject {

	public static void main(String[] args) {

		// it is normal java object
		Employee emp = new Employee();

		// create the Spring IOC container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\spring_core_module\\web_bean.xml");

		// get the spring bean object that is employee created by IOC container
		// What ever the IOC container object is the Spring bean object because the
		// Object information is pass to the IOC Container To Create the object.
		//Here we type cast to Employee because the getBean method return type is Object.
		Employee emp1 = (Employee) container.getBean("employee");
		
		//Normal object hashCode 
		System.out.println(emp.hashCode());
		
		//IOC Container object is different
		System.out.println(emp1.hashCode());
		
		Employee emp2 = (Employee) container.getBean("employee1");
		//employee2 object hashCode
		System.out.println(emp2.hashCode());
		
		Employee emp3 = (Employee) container.getBean("employee2");
		//Employee3 Object hashCode
		System.out.println(emp3.hashCode());
	}

}
