package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.StudentDao;
import com.spring.entities.Student;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("StudentDao",StudentDao.class);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        boolean go=true;
        while(go)
        {
	        System.out.println("PRESS 1 to Add Student");
	        System.out.println("PRESS 2 to Display All Student");
	        System.out.println("PRESS 3 to Display Single Student");
	        System.out.println("PRESS 4 to Delete Student");
	        System.out.println("PRESS 5 to Update Student");
	        System.out.println("PRESS 6 to exit");
       
	        
	        try
	        {
	        	int input = Integer.parseInt(br.readLine());
	        	switch(input)
	        	{
	        	  case 1:
	        		  System.out.println("Enter Student id");
	        		  int id = Integer.parseInt(br.readLine());
	        		  System.out.println("Enter user name");
	        		  String name = br.readLine();
	        		  System.out.println("Enter user city");
	        		  String city = br.readLine();
	        		  Student s = new Student(id,name,city);
	        		  int r = studentDao.insert(s);
	        		  System.out.println(r + "____student added successfully____");
	        		  break;
	        	  case 2:
	        		 List<Student> allstudent =  studentDao.getallstudent();
	        		 for(Student  s1 : allstudent)
	        		 {
	        			 System.out.println("******************************");
	        			 System.out.println("ID: " + s1.getId());
	        			 System.out.println("Name: " + s1.getStudentname());
	        			 System.out.println("City: " + s1.getStudentcity());
	        			 System.out.println("____________________________");
	        			 System.out.println("*******************************");
	        		 }
	        		  break;
	        	  case 3:
	        		  System.out.println("Enter Student id");
	        		  int sid = Integer.parseInt(br.readLine());
	        		  Student student = studentDao.getstudent(sid);
	        		  System.out.println("******************************");
	        		  System.out.println("ID: " + student.getId());
	        		  System.out.println("Name: " + student.getStudentname());
	        		  System.out.println("City: " + student.getStudentcity());
	        	      System.out.println("*******************************");
	        		  break;
	        	  case 4:
	        		  System.out.println("Enter Student id");
	        		  int sid1 = Integer.parseInt(br.readLine());
	        		  studentDao.delete(sid1);
	        		  System.out.println("student deleted successfully");
	        		  break;
	        	  case 5:
	        		   System.out.println("Enter userId to which you want to Update");
                       int ID= sc.nextInt();                                             // I am Using Scanner class here
                       sc.nextLine();

                       System.out.println("Enter UserName");
                       String userName1 = sc.nextLine();

                       System.out.println("Enter User City");
                       String userCity1 = sc.next();

                       Student st= new Student(ID,userName1,userCity1);                      // using parameterized constructor of Student class.
                       studentDao.update(st);                                                        // where stdimpl is our StudentDao class object we used to getBean in starting
                       System.out.println(ID+ " has been successfully updated");
	        		  break;
	        	  case 6:
	        		  go=false;
	        		  break;
	        	}
	        	System.out.println("thanks for using application");
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Invalid input try once again!!");
	        	System.out.println(e.getMessage());
	        }
        }
        
    }
      
}
