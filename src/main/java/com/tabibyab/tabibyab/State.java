package com.tabibyab.tabibyab;

public class State {

	String dID;
	Integer workhourID;
	Integer day;
	Integer month;
	Integer year;
	Integer start_hour;
	Integer end_hour;
	String aphone_number;
	String street;
	String alley;
	String plaque;
	Integer aID;

	public State(String dID, Integer workhourID, Integer day, Integer month, Integer year, Integer start_hour,
			Integer end_hour, String aphone_number, String street, String alley, String plaque, Integer aID) {
		super();
		this.dID = dID;
		this.workhourID = workhourID;
		this.day = day;
		this.month = month;
		this.year = year;
		this.start_hour = start_hour;
		this.end_hour = end_hour;
		this.aphone_number = aphone_number;
		this.street = street;
		this.alley = alley;
		this.plaque = plaque;
		this.aID = aID;
	}

	public String getdID() {
		return dID;
	}

	public void setdID(String dID) {
		this.dID = dID;
	}

	public Integer getWorkhourID() {
		return workhourID;
	}

	public void setWorkhourID(Integer workhourID) {
		this.workhourID = workhourID;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getStart_hour() {
		return start_hour;
	}

	public void setStart_hour(Integer start_hour) {
		this.start_hour = start_hour;
	}

	public Integer getEnd_hour() {
		return end_hour;
	}

	public void setEnd_hour(Integer end_hour) {
		this.end_hour = end_hour;
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

	public Integer getaID() {
		return aID;
	}

	public void setaID(Integer aID) {
		this.aID = aID;
	}

}
