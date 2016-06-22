package com.business;

import com.Model.RegisterModel;
import com.dao.RegisterDao;

public class RegisterBO {

	private RegisterModel registerModel;
	private RegisterDao registerDao;

	public RegisterModel getRegisterModel() {
		return registerModel;
	}

	public void setRegisterModel(RegisterModel registerModel) {
		this.registerModel = registerModel;
	}

	public RegisterDao getRegisterDao() {
		return registerDao;
	}

	public void setRegisterDao(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}
}
