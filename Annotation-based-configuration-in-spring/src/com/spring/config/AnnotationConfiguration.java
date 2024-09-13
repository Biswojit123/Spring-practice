package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.entity.BankPassBook;
import com.spring.entity.CheckBook;

//This annotation declare that class as the configuration class 
//so Container will know what ever the @Bean method are there it will create the object for that
@Configuration
public class AnnotationConfiguration {
	
	//Declare that method as bean object so, container will create the object for that BankPassBook class
	@Bean("bankPassbook")
	public BankPassBook getProduct() {
		//Here we create the Object
		BankPassBook passBook = new BankPassBook();
		//Set the value to the PassBook
		passBook.setAccountNumber(12345678);
		passBook.setBranch("Khallikote");
		passBook.setHolderName("Biswojit Jena");
		passBook.setIFSC("SBI002345");
		return passBook;
	}
	
	//second bean object for Same Class BankPassBook class
	@Bean("ramParida")
	public BankPassBook getProduct1() {
		//Here we create the Object
		BankPassBook passBook = new BankPassBook();
		//Set the value to the PassBook
		passBook.setAccountNumber(12345655);
		passBook.setBranch("Bajrakot");
		passBook.setHolderName("Ramkrushna Parida");
		passBook.setIFSC("SBI001245");
		return passBook;
	}
	
	//Configure the CheckBook Class
	@Bean("biswojit")
	public CheckBook getCheckBook() {
		//checkbook Created 
		CheckBook check = new CheckBook();
		//Set the value to the chackBook
		check.setAccount(1238956423);
		check.setAmount(45623.0);
		check.setName("Biswojit jena");
		check.setSignature("Biswojit Jena");
		return check;
	}
	
	
}
