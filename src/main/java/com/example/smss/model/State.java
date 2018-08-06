package com.example.smss.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "state")
public class State {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	@Transient
	private String courseId;
		
	public State(int id,String name){
		this.id=id;
		this.name=name;
	}
	public State(){}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	
	
}