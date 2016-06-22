package com.business;

import com.Model.AttendanceModel;
import com.dao.AttendanceDao;

public class AttendanceBO {

	private AttendanceModel attendanceModel;
	private AttendanceDao attendanceDao;

	public AttendanceModel getAttendanceModel() {
		return attendanceModel;
	}

	public void setAttendanceModel(AttendanceModel attendanceModel) {
		this.attendanceModel = attendanceModel;
	}

	public AttendanceDao getAttendanceDao() {
		return attendanceDao;
	}

	public void setAttendanceDao(AttendanceDao attendanceDao) {
		this.attendanceDao = attendanceDao;
	}
}
