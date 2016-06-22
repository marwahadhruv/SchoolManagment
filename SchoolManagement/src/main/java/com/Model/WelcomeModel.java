package com.Model;

 

public class WelcomeModel {
	private String teacherUserName;
	private String teacherPassword;
	private long schoolId;

	public String getTeacherPassword() {
		return teacherPassword;
	}
	public void setTeacherPassword(String teacherPassword) {
		this.teacherPassword = teacherPassword;
	}
	public long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}
	public String getTeacherUserName() {
		return teacherUserName;
	}
	public void setTeacherUserName(String teacherUserName) {
		this.teacherUserName = teacherUserName;
	}

	
}
