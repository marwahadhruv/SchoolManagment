package com.business;

import java.util.List;

import com.Model.WelcomeModel;
import com.dao.WelcomeDao;
import com.data.Teacher;

public class WelcomeBO {

	private WelcomeModel welcomeModel;
	private WelcomeDao welcomeDao;
	
	public List<Teacher> validateTeacher(WelcomeModel welcomeModel){
		return welcomeDao.validateTeacher(welcomeModel);
		
	}
	

	public WelcomeDao getWelcomeDao() {
		return welcomeDao;
	}

	public void setWelcomeDao(WelcomeDao welcomeDao) {
		this.welcomeDao = welcomeDao;
	}

	

	public WelcomeModel getWelcomeModel() {
		return welcomeModel;
	}

	public void setWelcomeModel(WelcomeModel welcomeModel) {
		this.welcomeModel = welcomeModel;
	}



	
	//welcomeDao.validateTeacher(WelcomeModel welcomeModel);
}
