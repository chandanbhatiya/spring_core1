package com.chandan.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[])
	{
	ApplicationContext	context=new ClassPathXmlApplicationContext("com/chandan/collection/confi2.xml");
	
	Student st=context.getBean("st1",Student.class);
	
	System.out.println(st);
	
	}

}
