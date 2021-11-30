package com.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question {

	int id;
	String text;
	boolean ismultip;
	Set<Response> reponses=new HashSet<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isIsmultip() {
		return ismultip;
	}
	public void setIsmultip(boolean ismultip) {
		this.ismultip = ismultip;
	}
	public Set<Response> getReponses() {
		return reponses;
	}
	public void setReponses(Set<Response> reponses) {
		this.reponses = reponses;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String text, boolean ismultip) {
		super();
		this.id = id;
		this.text = text;
		this.ismultip = ismultip;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + ", ismultip=" + ismultip + ", reponses=" + reponses + "]";
	}
	
	
	
	
}
