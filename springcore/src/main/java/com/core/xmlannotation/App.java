package com.core.xmlannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/xmlannotation/n.xml");
		Emp emp = (Emp)context.getBean("emp");
		System.out.println(emp);
	}
	
}
