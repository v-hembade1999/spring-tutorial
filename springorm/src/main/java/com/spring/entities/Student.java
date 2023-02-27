package com.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students_details")
public class Student 
{
	@Id
	@Column(name="sid")
	private int id;
	@Column(name="sname")
	private String studentname;
	@Column(name="scity")
	private String studentcity;
	
	public Student(int id, String studentname, String studentcity) 
	{
		super();
		this.id = id;
		this.studentname = studentname;
		this.studentcity = studentcity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
	
	
	
}
