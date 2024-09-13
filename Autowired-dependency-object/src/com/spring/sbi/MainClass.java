package com.spring.sbi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// create the Container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\Autowired-dependency-object\\spring-bean.xml");
		
		//Get the Order object
		Order order = (Order) container.getBean("order");
		
		System.out.println(order);
		
	}

}
