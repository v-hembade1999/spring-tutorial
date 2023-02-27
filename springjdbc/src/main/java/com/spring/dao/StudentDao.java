package com.spring.dao;

import java.util.List;

import com.spring.entite.Student;

public interface StudentDao 
{
	public int insert(Student student);
	public int update(Student student);
	public int delete(int sid);
	public Student getstudent(int id);
	public List<Student> getallstudent();
}
