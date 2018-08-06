package com.example.smss.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	private int id;
	
	
	
	private String sname;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}
	
	

}
