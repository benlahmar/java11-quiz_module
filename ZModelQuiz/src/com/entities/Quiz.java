package com.entities;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	int id;
	String titre;
	List<Question> questions=new ArrayList<>();
	
	
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Quiz(int id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", titre=" + titre + ", questions=" + questions + "]";
	}
	
	
}
