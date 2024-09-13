package com.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.entity.Order;

public class TestMain {

	public static void main(String[] args) {
		//Get created container
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.spring.*");
		container.refresh();
		
		//Get the Order object from the container
		Order order = container.getBean(Order.class);
		
		System.out.println(order);
		
		//get the transaction object
		System.out.println(order.getTransaction1());
		
		

	}

}
