package com.dao;


import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Model.WelcomeModel;
import com.data.Teacher;

 
@Repository
@Transactional
public class WelcomeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Teacher> validateTeacher(WelcomeModel welcomeModel){
		Criteria criteria = getSession().createCriteria(Teacher.class);
		criteria.add(Restrictions.eq("school_Id", welcomeModel.getSchoolId()));
		criteria.add(Restrictions.eq("teacher_Username", welcomeModel.getTeacherUserId()));
		criteria.add(Restrictions.eq("teacher_Password", welcomeModel.getTeacherPassword()));
		return criteria.list();
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


}
