package com.spring.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContainerMain {

	public static void main(String[] args) {

		// Get the container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\spring-constructor-injection\\spring-web.xml");
		
		//get the object from the container 
		Order order = (Order)container.getBean("order");
		
		System.out.println(order.getOderId());
		System.out.println(order.getHistory());
		System.out.println(order.getQuantity());
		System.out.println(order.getPriceWithProduct());
		System.out.println(order.getProduct());
		
		//get the order1 object
		Order order1 = (Order)container.getBean("order1");
		System.out.println(order1.getOderId());
		System.out.println(order1.getHistory());
		System.out.println(order1.getQuantity());
		System.out.println(order1.getPriceWithProduct());
		System.out.println(order1.getProduct());
		
		//get the order2 object
		Order order2 = (Order)container.getBean("order2");
		System.out.println(order2.getOderId());
		System.out.println(order2.getHistory());
		System.out.println(order2.getQuantity());
		System.out.println(order2.getPriceWithProduct());
		System.out.println(order2.getProduct());
		

	}

}
