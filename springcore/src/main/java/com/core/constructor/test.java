package com.core.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/constructor/cfg.xml");
		Employee e1 = (Employee) context.getBean("emp");
		e1.show();
		
	}
}
