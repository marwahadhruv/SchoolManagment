package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.data.School;


@Repository
@Transactional
public class LoginDao  {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<School> getSchoolNames(){
		
		return getSession().createCriteria(School.class).list();      
		
	}
	
	@Transactional
	 private Session getSession() {
         Session sess = getSessionFactory().getCurrentSession();
         if (sess == null) {
                sess = getSessionFactory().openSession();
         }
         //Transaction tx = sess.beginTransaction();
         return sess;
  }

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
