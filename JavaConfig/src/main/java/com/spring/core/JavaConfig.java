package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
		
		@Bean
		public Snacks getSnacks() {
			Snacks snacks = new Snacks();
			return snacks;
		}
	
		@Bean
		public Product getProduct() {
			
			//creating new student object
			Product product= new Product(getSnacks());
			return product;
		}
}
