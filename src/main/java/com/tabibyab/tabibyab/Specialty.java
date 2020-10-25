package com.tabibyab.tabibyab;

public class Specialty {

	Integer specialtyID;
	String name;

	public Specialty(Integer specialtyID, String name) {
		super();
		this.specialtyID = specialtyID;
		this.name = name;
	}

	public Integer getSpecialtyID() {
		return specialtyID;
	}

	public void setSpecialtyID(Integer specialtyID) {
		this.specialtyID = specialtyID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
