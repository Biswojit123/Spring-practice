package com.biswo.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biswo.entity.Movie;
import com.biswo.repository.SpringJpaRepository;

@Component
public class DBOperation {
	//auto-wired the repository 
	@Autowired
	private SpringJpaRepository repository;
	//Object saved method
	public void saveObject(Movie movie) {
		repository.save(movie);
	}
	
	//Object load
	public Movie selectObject(int id) {
		Movie movie = repository.findById(id).get();
		return movie;
	}
	
	//Object update
	public String updateMovieDetails(Movie movie) {
		repository.save(movie);
		return "Object Updated successfully!!!";
	}
	
	//Object delete operation 
	public String deleteObject(int movieId) {
		repository.deleteById(movieId);
		return "Deleted Successfully!!";
	}
}
