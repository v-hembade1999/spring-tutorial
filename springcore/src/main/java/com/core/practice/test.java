package com.core.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/practice/config.xml");
		question q =(question)context.getBean("question");
		System.out.println(q);
		
	}
	
}
