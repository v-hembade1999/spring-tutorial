package com.core.constructor;

import java.util.List;

public class Employee 
{
	private int id;
	private String name;
	private List<String> phone;
    private Address address;
	public Employee(int id, String name, List<String> phone, Address address) 
	{
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show()
	{
		System.out.println(id+" "+name);
		System.out.println(address.toString());
	}
	 
	
}
