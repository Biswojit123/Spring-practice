package com.spring.sbi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		// Create the container object
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\Autowired-dependency-object\\web-spring.xml");
		
		//get the bean object from the container
		Account account = (Account) container.getBean("account");
		System.out.println(account);
		System.out.println(account.getTransaction());
		System.out.println(account.getTransaction1());
		
	}

}
