package com.aop.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.paymentservice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
        paymentservice paymentobj = context.getBean("payment",paymentservice.class);
        paymentobj.makepayment();
    }
}
