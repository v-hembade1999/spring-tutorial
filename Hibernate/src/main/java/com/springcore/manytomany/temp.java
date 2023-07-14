package com.springcore.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class temp 
{

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		//creating emp
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEmpname("ram");
		e1.setEmpid(34);
		
		e2.setEmpname("sam");
		e2.setEmpid(35);
		//creating project
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(12121);
		p1.setPname("python");
		
		p2.setPid(14214);
		p2.setPname("java");
		
		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		list1.add(e1);
		list1.add(e2);
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmp(list1);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();

		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);

		tx.commit();
		s.close();

		factory.close();
	}

}
