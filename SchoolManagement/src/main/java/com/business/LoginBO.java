package com.business;

import java.util.List;

import com.Model.LoginModel;
import com.dao.LoginDao;
import com.dao.WelcomeDao;
import com.data.School;

public class LoginBO {
	
	private LoginModel loginModel;
	private LoginDao loginDao;
	private WelcomeDao welcomeDao;
	
	public List<School> getSchoolNames(){
		List<School> listSchool = loginDao.getSchoolNames();
		
		return listSchool;
		
	}

	public LoginModel getLoginModel() {
		return loginModel;
	}

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

}
