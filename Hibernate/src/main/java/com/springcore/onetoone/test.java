package com.springcore.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Questions q1 = new Questions();
		q1.setQuestion_id(1);
		q1.setQuestion("what is java?");
		
		
		Answers a1 = new Answers();
		a1.setAnswewr_id(11);
		a1.setAnswer("java is programming language");
		q1.setAnswers(a1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q1);
		s.save(a1);
		tx.commit();
		factory.close();
		

	}

}
