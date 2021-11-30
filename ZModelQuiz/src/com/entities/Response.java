package com.entities;

public class Response {

	int id;
	String rep;
	boolean istrue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRep() {
		return rep;
	}
	public void setRep(String rep) {
		this.rep = rep;
	}
	public boolean isIstrue() {
		return istrue;
	}
	public void setIstrue(boolean istrue) {
		this.istrue = istrue;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(int id, String rep, boolean istrue) {
		super();
		this.id = id;
		this.rep = rep;
		this.istrue = istrue;
	}
	@Override
	public String toString() {
		return "Response [id=" + id + ", rep=" + rep + ", istrue=" + istrue + "]";
	}
	
	
}
