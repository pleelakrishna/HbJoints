package com.example.smss.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.smss.model.Student;

@Repository
@Transactional
public class StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	
	public List<Student> getAllStudents(){
		Session session =sessionFactory.getCurrentSession();
		Criteria c=session.createCriteria(Student.class);//passing Class class argument  
		c.setFetchMode("students", FetchMode.JOIN);
		c.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		
		
		List list=c.list();
		return list;
		
		
		
	}

}
