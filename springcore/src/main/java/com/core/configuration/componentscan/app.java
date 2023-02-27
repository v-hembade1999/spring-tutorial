package com.core.configuration.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
		user u1 = (user) context.getBean("userbean");
		u1.print();

	}

}
