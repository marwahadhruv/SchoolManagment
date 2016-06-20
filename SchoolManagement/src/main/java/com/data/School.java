package com.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="School")
public class School {
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long school_Id;
	private String school_Name;


	public Long getSchool_Id() {
		return school_Id;
	}
	public void setSchool_Id(Long school_Id) {
		this.school_Id = school_Id;
	}
	public String getSchool_Name() {
		return school_Name;
	}
	public void setSchool_Name(String school_Name) {
		this.school_Name = school_Name;
	}
	public String getSchool_Address() {
		return school_Address;
	}
	public void setSchool_Address(String school_Address) {
		this.school_Address = school_Address;
	}
	public String getSchool_Branch() {
		return school_Branch;
	}
	public void setSchool_Branch(String school_Branch) {
		this.school_Branch = school_Branch;
	}
	public String getSchool_Username() {
		return school_Username;
	}
	public void setSchool_Username(String school_Username) {
		this.school_Username = school_Username;
	}
	public String getSchool_Password() {
		return school_Password;
	}
	public void setSchool_Password(String school_Password) {
		this.school_Password = school_Password;
	}
	private String school_Address;
	private String school_Branch;
	private String school_Username;
	private String school_Password;

}
