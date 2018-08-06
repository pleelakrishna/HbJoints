package com.example.smss.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Course {
	

	@Id
	private int id;
	
	private String sname;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="course_id")
	private Set<Student> students;

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

	@Override
	public String toString() {
		return "Course [id=" + id + ", sname=" + sname + "]";
	}
	
	
	
	
	
	

}
