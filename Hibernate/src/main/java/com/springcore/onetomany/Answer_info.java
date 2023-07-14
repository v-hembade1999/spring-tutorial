package com.springcore.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Answer_info 
{
	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String answer;	
	@ManyToOne	
	private Question_info question;
	public Answer_info(int answerId, String answer) 
	{
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	public Answer_info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question_info getQuestion() {
		return question;
	}
	public void setQuestion(Question_info question) {
		this.question = question;
	}
	
}
	
	
	
		
		

