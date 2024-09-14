package com.biswo.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "MOVIE_INF")
@DynamicUpdate
public class Movie {
	@Id
	@Column(name = "MID")
	private Integer movieId;
	@Column(name = "MNAME")
	private String movieName;
	@Column(name = "MHERO")
	private String movieHero;
	@Column(name = "MBUDGET")
	private Double movieBudget;
	//0-Parameter constructor
	public Movie() {
		super();
		System.out.println("Movie Object Created successfully");
	}
	//Multiple parameter constructor
	public Movie(Integer movieId, String movieName, String movieHero, Double movieBudget) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieHero = movieHero;
		this.movieBudget = movieBudget;
	}
	//Getter and setter method
	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieHero() {
		return movieHero;
	}

	public void setMovieHero(String movieHero) {
		this.movieHero = movieHero;
	}

	public Double getMovieBudget() {
		return movieBudget;
	}

	public void setMovieBudget(Double movieBudget) {
		this.movieBudget = movieBudget;
	}
	//ToString method
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieHero=" + movieHero + ", movieBudget="
				+ movieBudget + "]";
	}

}
