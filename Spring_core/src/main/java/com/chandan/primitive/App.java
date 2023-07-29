package com.chandan.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[])
	{
		
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/chandan/primitive/confi2.xml");
		
		Student st= context.getBean("st1",Student.class);
		Student st2= context.getBean("st2",Student.class);
		
		System.out.println(st);
		
		System.out.println(st2);
		
	}

}
