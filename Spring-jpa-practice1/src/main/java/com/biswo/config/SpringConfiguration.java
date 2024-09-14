package com.biswo.config;

import java.util.Properties;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories("com.*")
@ComponentScan("com.*")
public class SpringConfiguration {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("system");
		dataSource.setPassword("Biswojit");
		return dataSource;
	}
	
	@Bean("entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getEntityManager() {
		//Create the Local Container object for set the all information to that object
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		//Set the data Source object 
		factory.setDataSource(getDataSource());
		//set the Entity Packages
		factory.setPackagesToScan("com.biswo.entity");
		//set the Hibernate properties
		factory.setJpaProperties(getHibernateProperties());
		//set the JPA vendor adapter
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(adapter);
		return factory;
	}
	
	@Bean("transactionManager")
	public PlatformTransactionManager getTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		
		transactionManager.setEntityManagerFactory(getEntityManager().getObject());
		
		return transactionManager;	
	}
	
	//return the hibernate Properties
	public Properties getHibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		return hibernateProperties;
	}
	
	@Bean("scanner")
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
}
