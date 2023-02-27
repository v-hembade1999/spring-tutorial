package com.springcore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.dao.StudentDao;
import com.spring.entite.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        //to get single student data.
        
        //Student student = studentDao.getstudent(11);
        // System.out.println(student);
        
        //to get multiple student data
        List<Student> students = studentDao.getallstudent();
        for(Student s : students)
        {
        	System.out.println(s);
        }
        
    }
}
