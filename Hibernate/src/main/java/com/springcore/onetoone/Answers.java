package com.springcore.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Answers 
{
	@Id
	private int answewr_id;
	private String answer;
	public Answers(int answewr_id, String answer) {
		super();
		this.answewr_id = answewr_id;
		this.answer = answer;
	}
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAnswewr_id() {
		return answewr_id;
	}
	public void setAnswewr_id(int answewr_id) {
		this.answewr_id = answewr_id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answers [answewr_id=" + answewr_id + ", answer=" + answer + "]";
	}
	
	
}
