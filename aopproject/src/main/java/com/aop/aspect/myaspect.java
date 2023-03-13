package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect 
public class myaspect 
{
	@Before("execution(* com.aop.service.paymentserviceimpl.makepayment())")
	public void printbefore()
	{
		System.out.println("payment started");
	}
	
	@After("execution(* com.aop.service.paymentserviceimpl.makepayment())")
	public void printafter()
	{
		System.out.println("payment done");
	}
}
