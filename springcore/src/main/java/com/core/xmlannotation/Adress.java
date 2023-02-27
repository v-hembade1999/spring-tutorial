package com.core.xmlannotation;

public class Adress
{
	private String empadress;
	private String empcitycode;
	public String getEmpadress() 
	{
		return empadress;
	}
	public void setEmpadress(String empadress) 
	{
		this.empadress = empadress;
	}
	public String getEmpcitycode() 
	{
		return empcitycode;
	}
	public void setEmpcitycode(String empcitycode) 
	{
		this.empcitycode = empcitycode;
	}
	@Override
	public String toString() {
		return "Adress [empadress=" + empadress + ", empcitycode=" + empcitycode + "]";
	}
	
}
