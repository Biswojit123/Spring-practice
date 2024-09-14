package com.biswo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.biswo.config.SpringConfiguration;
import com.biswo.dao.DBOperation;
import com.biswo.entity.Movie;

public class Clientapplication_LoadObject {
	//this is main method
	public static void main(String []args) {
		//get the container object
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		//get the DBOPeration Class object
		DBOperation operation = container.getBean(DBOperation.class);
		//get the scanner class
		Scanner sc = container.getBean(Scanner.class);
		try(sc) {
			System.out.println("Enter the MovieId::");
			int movieId = sc.nextInt();
			//call the DBOperation class load method
			Movie movie = operation.selectObject(movieId);
			//print the details
			System.out.println(movie);
		}catch(Exception e) {
			System.out.println("Object is not loaded");
			e.printStackTrace();
		}
	}
}
