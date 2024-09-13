package com.spring.sbi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TextMain2 {

	public static void main(String[] args) {

		// Create the container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\Autowired-dependency-object\\bean-spring.xml");
		
		//get the Bean Object
		Order order = (Order) container.getBean("order1");
		
		System.out.println(order);
		

	}

}
