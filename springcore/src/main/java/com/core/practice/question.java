package com.core.practice;

public class question 
{
	  private int id;
	  private String qname;
	  private String answer;
	  
	  public question(int id, String qname, String answer) 
	  {
		super();
		this.id = id;
		this.qname = qname;
		this.answer = answer;
	  }

	  public question() 
	  {
		super();
		// TODO Auto-generated constructor stub
	  }

	@Override
	public String toString() {
		return "question [id=" + id + ", qname=" + qname + ", answer=" + answer + "]";
	}
	  
	    
	  
  
}
