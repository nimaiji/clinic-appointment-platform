package com.tabibyab.tabibyab;

public class HDoctor {

	String username;
	String medicalCouncilCode;
	String firstName;
	String lastName;
	String password;
	Integer visitPrice;
	String photo;
	Integer sID;
	Integer hID;
	public HDoctor(String username, String medicalCouncilCode, String firstName, String lastName, String password,
			Integer visitPrice, String photo, Integer sID, Integer hID) {
		super();
		this.username = username;
		this.medicalCouncilCode = medicalCouncilCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.visitPrice = visitPrice;
		this.photo = photo;
		this.sID = sID;
		this.hID = hID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMedicalCouncilCode() {
		return medicalCouncilCode;
	}
	public void setMedicalCouncilCode(String medicalCouncilCode) {
		this.medicalCouncilCode = medicalCouncilCode;
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
	public Integer getVisitPrice() {
		return visitPrice;
	}
	public void setVisitPrice(Integer visitPrice) {
		this.visitPrice = visitPrice;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getsID() {
		return sID;
	}
	public void setsID(Integer sID) {
		this.sID = sID;
	}
	public Integer gethID() {
		return hID;
	}
	public void sethID(Integer hID) {
		this.hID = hID;
	}

	
	
}
