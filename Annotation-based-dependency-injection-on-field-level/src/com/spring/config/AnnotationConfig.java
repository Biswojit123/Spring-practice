package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.entity.Transaction;

@Configuration
public class AnnotationConfig {
	
	@Bean("transaction")
	public Transaction getTransaction() {
		return new Transaction();
	}
}
