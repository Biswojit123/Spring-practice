package com.biswo.test;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.biswo.config.SpringConfiguration;
import com.biswo.dao.DBOperation;

public class DeleteObject {

	public static void main(String[] args) throws IOException {
		
		//Get the container object
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		//get the DBOperation 
		DBOperation operation = container.getBean(DBOperation.class);
		//get the Scanner  class
		Scanner sc = (Scanner)container.getBean("scanner");

		//get the id what you delete
		System.out.println("Enter the Movie Id::");
		int movieId = sc.nextInt();
		
		//pass the movieId 
		String delete = operation.deleteObject(movieId);
		
		if(delete == null) {
			System.out.println("Some internal error occure");
		}else {
			System.out.println("Delete Successfully!!!");
		}
		
		((Closeable) container).close();

	}

}
