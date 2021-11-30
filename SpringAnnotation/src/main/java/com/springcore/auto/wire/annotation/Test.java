package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		  	
			System.out.println( "Hello World!" );
	        @SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/config.xml");
	        Emp e1 =context.getBean("e1",Emp.class);
	        
	        System.out.println(e1);
	}

}
