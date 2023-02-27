package com.core.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/core/autowired/annotation/cf.xml");
		Emp e1 = (Emp) context.getBean("emp");
	    e1.show();

	}

}
