package com.spring.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.entity.Order;
import com.spring.entity.Product;

public class TestClass {

	public static void main(String[] args) {

		// Create the container
		// ApplicationContext container = new
		// AnnotationConfigApplicationContext(AnnotationConfiguration.class);

		// Three way to create the container above is the first approach
		// second approach
		// AnnotationConfigApplicationContext container = new
		// AnnotationConfigApplicationContext();
		// This is for register
		// container.register(AnnotationConfiguration.class);
		// This is for refresh
		// container.refresh();

		// third approach in this approach no need to write the @ComponenetScan annotation
		// for scanning the @component annotation class for creating the Bean object
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.scan("com.*");
		container.refresh();

		// If container create the object scanning @Componenet class then how to get the
		// object from the container
		// If we don't give any id name to that class then it by default take the id
		// name as Class name how to prove it
		// By providing the class name in getBean method and that class name First
		// latter should be small
		Order order = (Order) container.getBean("order");

		System.out.println(order);// proved

		// Requirement is spring container will create the object with some value
		// Then we should go for @Bean configuration in method level
		// And @Bean configuration used to if we have a requirement single class for
		// multiple object created and different value

		// So we have to get the object from the container then how to get the object
		// if we are not specify the id name to that bean class then spring container by
		// default take id name as the method name
		// we get the object throw the method name . only we have to pass that method
		// name to getBean method as parameter.
		Product product = (Product) container.getBean("getProduct");
		System.out.println(product);

		Product product1 = (Product) container.getBean("getProduct1");
		System.out.println(product1);

	}

}
