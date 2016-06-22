package com.business;

import com.Model.ChangeClassModel;
import com.dao.ChangeClassDao;

public class ChangeClassBO {

	private ChangeClassModel changeClassModel;
	private ChangeClassDao changeClassDao;



	public ChangeClassModel getChangeClassModel() {
		return changeClassModel;
	}

	public void setChangeClassModel(ChangeClassModel changeClassModel) {
		this.changeClassModel = changeClassModel;
	}

	public ChangeClassDao getChangeClassDao() {
		return changeClassDao;
	}

	public void setChangeClassDao(ChangeClassDao changeClassDao) {
		this.changeClassDao = changeClassDao;
	}
}
