package com.chandan.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String args[]) {
		
	ApplicationContext	context=new ClassPathXmlApplicationContext("com/chandan/ci/confi2.xml");
Student	s=context.getBean("st",Student.class);

System.out.println(s);
	}
}
