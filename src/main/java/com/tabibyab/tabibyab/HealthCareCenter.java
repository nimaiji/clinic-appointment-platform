package com.tabibyab.tabibyab;

public class HealthCareCenter {

	Integer hccID;
	String aphone_number;
	String street;
	String alley;
	String plaque;

	public HealthCareCenter(Integer hccID, String aphone_number, String street, String alley, String plaque) {
		super();
		this.hccID = hccID;
		this.aphone_number = aphone_number;
		this.street = street;
		this.alley = alley;
		this.plaque = plaque;
	}

	public Integer getHccID() {
		return hccID;
	}

	public void setHccID(Integer hccID) {
		this.hccID = hccID;
	}

	public String getAphone_number() {
		return aphone_number;
	}

	public void setAphone_number(String aphone_number) {
		this.aphone_number = aphone_number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAlley() {
		return alley;
	}

	public void setAlley(String alley) {
		this.alley = alley;
	}

	public String getPlaque() {
		return plaque;
	}

	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}

}
