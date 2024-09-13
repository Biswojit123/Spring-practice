package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AnnotationConfiguration;
import com.spring.entity.BankPassBook;
import com.spring.entity.CheckBook;

public class ContrainerClassMain {

	public static void main(String[] args) {

		// Container object created
		// Here we pass the Configuration Class to the Container so container scan the
		// whole configuration class and create the Object for that
		ApplicationContext container = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
		
		//get the object in container because, if container actually create object or not.
		BankPassBook bankPassbook = (BankPassBook) container.getBean("bankPassbook");
		
		System.out.println(bankPassbook);//same hash code
		
		//Get the object 2nd time
		BankPassBook passBook = (BankPassBook) container.getBean("bankPassbook");
		
		System.out.println(passBook);//same hash code because the singleton by default
		
		//Get the Ram PassBook
		BankPassBook passBook1 = (BankPassBook) container.getBean("ramParida");
		
		System.out.println(passBook1);
		
		//get the Check book object 
		CheckBook check = (CheckBook) container.getBean("biswojit");
		System.out.println(check);

	}

}
