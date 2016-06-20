package com.business;

import java.util.HashMap;
import java.util.List;

import com.Model.LoginModel;
import com.dao.LoginDao;
import com.data.School;

public class LoginBO {
	
	private LoginModel loginModel;
	private LoginDao loginDao;
	
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
