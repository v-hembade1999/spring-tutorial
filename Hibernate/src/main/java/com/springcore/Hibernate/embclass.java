package com.springcore.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class embclass 
{

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("rock");
		student1.setCity("pune");
		
		
		
		Certificate c1 = new Certificate();
		c1.setCourse("python");
		c1.setDuration("100");
		
		student1.setCertificate(c1);
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(student1);
		t.commit();
		s.close();
		factory.close();

	}

}
