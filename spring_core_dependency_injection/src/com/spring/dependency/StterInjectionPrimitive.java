package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class StterInjectionPrimitive {

	public static void main(String[] args) {

		// create the IOC container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\spring_core_dependency_injection\\spring-bean.xml");
		
		//Get the object from the container
		Orders order = (Orders) container.getBean("order1");
		
		System.out.println(order.getOrderId());
		System.out.println(order.getProductName());
		System.out.println(order.getFoodType());
		System.out.println(order.getTotalPrice());
		System.out.println(order.getMobileNum());
		System.out.println(order.getProductAvialable());
		
		

	}

}
