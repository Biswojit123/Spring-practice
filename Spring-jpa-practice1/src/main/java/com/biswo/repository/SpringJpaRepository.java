package com.biswo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biswo.entity.Movie;

@Repository
public interface SpringJpaRepository extends JpaRepository<Movie, Integer> {

}
