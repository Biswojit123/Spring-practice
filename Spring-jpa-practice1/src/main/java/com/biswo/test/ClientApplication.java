package com.biswo.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.biswo.config.SpringConfiguration;
import com.biswo.dao.DBOperation;
import com.biswo.entity.Movie;

public class ClientApplication {

	public static void main(String[] args) {
		//Container create 
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		//get the Movie object from the container
		Movie movie = container.getBean(Movie.class);
		//I want to get the Scanner object
		Scanner sc = (Scanner) container.getBean("scanner");
		try(sc) {
			System.out.println("Enter the Movie name::");
			String movieName = sc.next();
			System.out.println("Enter the Movie MovieId::");
			int movieId = sc.nextInt();
			System.out.println("Enter the Movie Hero::");
			String hero = sc.next();
			System.out.println("Enter the Movie Budget");
			double movieBudget = sc.nextDouble();
			//set the all values to the so we can perform the save operation
			movie.setMovieBudget(movieBudget);
			movie.setMovieHero(hero);
			movie.setMovieId(movieId);
			movie.setMovieName(movieName);
			//get the DbOpeartion bean object
			DBOperation dbOperation = container.getBean(DBOperation.class);
			//perform the save operation
			dbOperation.saveObject(movie);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
