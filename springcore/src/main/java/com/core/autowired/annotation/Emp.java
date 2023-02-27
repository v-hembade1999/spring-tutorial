package com.core.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp 
{
   private String id;
   private Address address;
   @Autowired
   public Emp(String id, Address address) 
   {
		super();
		this.id = id;
		this.address = address;
   }
   public void show()
   {
	   System.out.println(id);
   }
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
}
