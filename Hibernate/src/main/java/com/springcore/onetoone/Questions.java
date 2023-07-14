package com.springcore.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Questions 
{
	@Id
	private int question_id;
	private String question;
	@OneToOne
	private Answers answers;
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public String getQuestion() {
		return question;
	}
	public Answers getAnswers() {
		return answers;
	}
	public void setAnswers(Answers answers) {
		this.answers = answers;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(int question_id, String question) {
		super();
		this.question_id = question_id;
		this.question = question;
	}
	
}
