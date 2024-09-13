package com.spring.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ContainerClass {

	public static void main(String[] args) {

		// Get the container
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\bean-wiring-throw-constructor-or-setter-injection\\bean-spring.xml");
		
		//get the Holder object
		Holder holder = (Holder) container.getBean("holder");
		System.out.println(holder.getAccountNumber());
		System.out.println(holder.getIdProof());
		System.out.println(holder.getNameHolder());
		System.out.println(holder.getLoan().getAmountProvide());
		System.out.println(holder.getLoan().getLoanName());
		System.out.println(holder.getLoan().getBankToGetLoan().getBankName());
		System.out.println(holder.getLoan().getBankToGetLoan().getBranch());
		System.out.println(holder.getLoan().getBankToGetLoan().getLons());
		System.out.println(holder.getLoan().getBankToGetLoan().getServices());
		
	}

}
