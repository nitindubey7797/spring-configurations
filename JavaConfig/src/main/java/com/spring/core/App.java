package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
	@SuppressWarnings("resource")
	ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
	
	Product product =con.getBean("getProduct",Product.class);
	System.out.println(product);
	product.productDetails();
}
}
