package com.business;

import com.Model.WelcomeModel;
import com.dao.WelcomeDao;

public class WelcomeBO {

	private WelcomeModel welcomeModel;
	private WelcomeDao welcomeDao;
	
	public void validateTeacher(WelcomeModel welcomeModel){
		welcomeDao.validateTeacher(welcomeModel);
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
