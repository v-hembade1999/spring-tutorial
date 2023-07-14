package com.springcore.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating question
		Question_info q1 = new Question_info();
		q1.setQuestionId(1);
		q1.setQuestion("what is java and its uses?");
		//creating answers
	    Answer_info a1 = new Answer_info();
	    a1.setAnswerId(11);
	    a1.setAnswer("java programming language");
	    a1.setQuestion(q1);
	    
	    Answer_info a2 = new Answer_info();
	    a2.setAnswerId(12);
	    a2.setAnswer("java is used to build software");
	    a2.setQuestion(q1);
	    
	    List<Answer_info> list = new ArrayList<Answer_info>();
	    list.add(a1);
	    list.add(a2);
	    q1.setAnswers(list);
		
		//session 
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		//save
		s.save(q1);
		s.save(a1);
		s.save(a2);
		tx.commit();
		s.close();
		factory.close();

	}

}
