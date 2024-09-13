package com.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainCalss {

	public static void main(String[] args) {

		// Create the container object
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\BeanScope\\spring-bean.xml");
		
		//Get the object from the container
		//Its my first request to get the DebiCard Object container will give this object
		DebitCard debitCard = (DebitCard) container.getBean("debitCard");
		//Container provide the first time request object if it is available 
		System.out.println("Container provided object hash code is::"+debitCard);
		
		//Second time i required the DebitCrad Object so i request to the container
		DebitCard debitCard1 = (DebitCard) container.getBean("debitCard");
		//Here we get the same object hash code by container so,
		System.out.println("Container provided object hash code is::"+debitCard1);
		
		//Conclusion is:: Spring Container Create the object and maintain the scope singleton byDefault
		//so every request for that object container do't create the object it simple refer the already 
		//present object
		
		System.out.println("Conatiner maintain the Scope for each object request is prototype");
		
		//this is the First request
		DebitCard debitCard2 = (DebitCard) container.getBean("debitCard1");
		System.out.println("Conatiner provide hash code is::"+debitCard2);
		
		DebitCard debitCard3 = (DebitCard) container.getBean("debitCard1");
		System.out.println("Conatiner provide hash code is::"+debitCard3);
		

	}

}
