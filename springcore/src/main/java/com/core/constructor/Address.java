package com.core.constructor;

public class Address 
{
	private String city;
	private String street;
	private String code;
	public Address(String city, String street, String code) 
	{
		super();
		this.city = city;
		this.street = street;
		this.code = code;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", code=" + code + "]";
	}
	
}
