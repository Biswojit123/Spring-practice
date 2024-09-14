package com.biswo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.biswo.config.SpringConfiguration;
import com.biswo.dao.DBOperation;
import com.biswo.entity.Movie;

public class UpdateTheMovieObject {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		//get the Scanner object
		Scanner sc = (Scanner)container.getBean("scanner");
		//get the DBOpertaion class object 
		DBOperation operation = container.getBean(DBOperation.class);
		System.out.println("Enter the Id:");
		int movieId = sc.nextInt();
		//get the Movie object
		Movie movie = operation.selectObject(movieId);
		if(movie != null) {
			System.out.println("Record is not found!!");
		}
		//update operation on the loading object
		movie.setMovieBudget(500000.0);
		movie.setMovieHero("Prabhas");
		//pass that object to the save operation
		String status = operation.updateMovieDetails(movie);
		 if(status==null) {
			 System.out.println("Some error will happen!!");
		 }else {
			 System.out.println(status);
		 }
		 //
	}

}
