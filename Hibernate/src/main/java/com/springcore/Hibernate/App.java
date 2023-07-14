package com.springcore.Hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.config.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("sky");
        s1.setCity("pune");
        System.out.println(s1);
        
        Address a1 = new Address();
        a1.setStreet("vimannagar");
        a1.setCity("pune");
        a1.setOpen(true);
        a1.setAdddate(new Date());
        a1.setX(12345);
        //reading image
        FileInputStream fs = new FileInputStream("src/main/java/mm.png");
        byte[] data = new byte[fs.available()];
        fs.read(data);
        a1.setImage(data);
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(s1);
        session.save(a1);
        session.getTransaction().commit();
        session.close();
        
    }
}
