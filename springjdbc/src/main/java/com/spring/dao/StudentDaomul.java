package com.spring.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.entite.Student;

public class StudentDaomul implements StudentDao
{
    private JdbcTemplate jdbcTemplate;
	public int insert(Student student) 
	{
		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int update(Student student)
	{
		String query = "update student set name=?,city=? where id=?";
		int w = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return w;
		
	}

	public int delete(int sid) 
	{
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query,sid);
		return r;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public Student getstudent(int id) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new rowMapperImp();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper,id);
		return student;
	}
	public List<Student> getallstudent() 
	{
		// TODO Auto-generated method stub
		String query="select * from student";
	    List<Student> students = this.jdbcTemplate.query(query,new rowMapperImp());
		return students;
	}

}
