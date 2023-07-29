package com.chandan.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/chandan/refrence/confi2.xml");
		
	Student	s=context.getBean("st",Student.class);
	
	System.out.println(s.getName());
	System.out.println(s.getAddress());
	
	}

}
