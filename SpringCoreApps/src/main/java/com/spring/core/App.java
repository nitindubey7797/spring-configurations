package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Product product1 =(Product)context.getBean("product1");
        Product product2 =(Product)context.getBean("product2");
 
        System.out.println(product1);
        System.out.println(product2);
    }
}
