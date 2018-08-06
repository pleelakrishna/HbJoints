package com.example.smss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smss.Dao.StudentDao;
import com.example.smss.model.Student;

@RestController
public class HomeController {
	
	@Autowired
	StudentDao studentDao;
	
	@GetMapping("/")
	public List<Student> show(){
		
		List<Student> list =studentDao.getAllStudents();
		
		return list;
		
		
	}

}
