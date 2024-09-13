package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.entity.Product;

//Declare the configuration class using the given annotation
@Configuration
public class AnnotationConfiguration {
	
	@Bean
	public Product getProduct() {
		Product product = new Product();
		product.setPrice(200.00);
		product.setProductId(12345566);
		product.setProductName("Nell-Police");
		product.setQat(2);
		return product;
	}
	
	@Bean
	public Product getProduct1() {
		Product product = new Product();
		product.setPrice(600.00);
		product.setProductId(1238956);
		product.setProductName("Mirror");
		product.setQat(6);
		return product;
	}
}
