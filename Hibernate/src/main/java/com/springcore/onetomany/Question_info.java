package com.springcore.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question_info 
{
	@Id
	@Column(name = "question_id")
	private int questionId;
	
	private String question;
	
	@OneToMany(mappedBy = "question")
	private List<Answer_info> answers;

	public Question_info(int questionId, String question, List<Answer_info> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public Question_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer_info> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer_info> answers) {
		this.answers = answers;
	}

	
	
	
}
