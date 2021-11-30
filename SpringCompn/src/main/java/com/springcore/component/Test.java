package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext con = 
				new ClassPathXmlApplicationContext("com/springcore/component/stereoconfig.xml");
		Student student = con.getBean("student",Student.class);
		System.out.println(student);

	}

}
