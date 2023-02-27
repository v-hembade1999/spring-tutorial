package com.spring.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.entities.Student;

public class StudentDao 
{
	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//save student
	@Transactional
	public int insert(Student student)
	{
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
		
	}
	//get student
	public Student getstudent(int studentId)
	{
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	//get all student
	public List<Student> getallstudent()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	//delete
	@Transactional
	public void delete(int studentId)
	{
		Student student = this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//update
	@Transactional
	public void update(Student student)
	{
		this.hibernateTemplate.update(student);
	}
}
