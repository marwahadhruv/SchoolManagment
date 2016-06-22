package com.business;

import com.Model.SelectClassModel;
import com.dao.SelectClassDao;

public class SelectClassBO {

	private SelectClassModel selectClassModel;
	private SelectClassDao selectClassDao;

	public SelectClassModel getSelectClassModel() {
		return selectClassModel;
	}

	public void setSelectClassModel(SelectClassModel selectClassModel) {
		this.selectClassModel = selectClassModel;
	}

	public SelectClassDao getSelectClassDao() {
		return selectClassDao;
	}

	public void setSelectClassDao(SelectClassDao selectClassDao) {
		this.selectClassDao = selectClassDao;
	}
}
