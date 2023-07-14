package com.springcore.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
@Entity
public class Emp 
{ 
	@Id
	private int empid;
	private String empname;
	@ManyToMany
	private List<Project> projects;
	public Emp(int empid, String empname, List<Project> projects) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.projects = projects;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
}
