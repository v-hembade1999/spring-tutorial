package com.springcore.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdemo 
{

	public static void main(String[] args) 
	{
	 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student student = (Student)session.load(Student.class,1);
		System.out.println(student);
		
		
	}

}
