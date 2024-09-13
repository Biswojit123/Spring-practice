package com.core.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCContainerDemo {

	public static void main(String[] args) {

		// Create the IOC Container Object 
		//In this time all Spring bean object will created successfully that are configure throw XML
		ApplicationContext container = new FileSystemXmlApplicationContext(
				"D:\\Spring_Applicatn_Extract\\spring-mvc-module-pro\\spring_core_module\\web_bean.xml");
		
		//Employee All object created successfully because the all employee object configure in the XML file
		//But Student object not created because the student is not configure in the XMl
		//so Student is the normal object
		//so,conclusion is what ever object will created by IOC container that object are Spring Bean Object

	}

}
