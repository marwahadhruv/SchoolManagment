package com.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teacher")
public class Teacher {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long teacher_Id;
	private String teacher_Fname;
	private String teacher_Lname;
	private String teacher_Username;
	private String teacher_Password;
	private long school_Id;
	
	public long getTeacher_Id() {
		return teacher_Id;
	}
	public void setTeacher_Id(long teacher_Id) {
		this.teacher_Id = teacher_Id;
	}
	public String getTeacher_Fname() {
		return teacher_Fname;
	}
	public void setTeacher_Fname(String teacher_Fname) {
		this.teacher_Fname = teacher_Fname;
	}
	public String getTeacher_Lname() {
		return teacher_Lname;
	}
	public void setTeacher_Lname(String teacher_Lname) {
		this.teacher_Lname = teacher_Lname;
	}
	public String getTeacher_Username() {
		return teacher_Username;
	}
	public void setTeacher_Username(String teacher_Username) {
		this.teacher_Username = teacher_Username;
	}
	public String getTeacher_Password() {
		return teacher_Password;
	}
	public void setTeacher_Password(String teacher_Password) {
		this.teacher_Password = teacher_Password;
	}
	public long getSchool_Id() {
		return school_Id;
	}
	public void setSchool_Id(long school_Id) {
		this.school_Id = school_Id;
	}


}
