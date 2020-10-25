package com.tabibyab.tabibyab;

import org.apache.ibatis.type.Alias;
import org.springframework.lang.Nullable;


public class User {
	
	String phonenumber;
	Integer gID;
	Integer iID;
	String firstName;
	String lastName;
	String password;
	String photo;
	String birthDay;
	
	public User(String phonenumber, @Nullable Integer gID, @Nullable  Integer iID, @Nullable String firstName,@Nullable String lastName, String password,@Nullable String photo,
			@Nullable String birthDay) {
		super();
		this.phonenumber = phonenumber;
		this.gID = gID;
		this.iID = iID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.photo = photo;
		this.birthDay = birthDay;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Integer getgID() {
		return gID;
	}

	public void setgID(Integer gID) {
		this.gID = gID;
	}

	public Integer getiID() {
		return iID;
	}

	public void setiID(Integer iID) {
		this.iID = iID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
	
	

}
