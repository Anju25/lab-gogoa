package model;

import java.time.LocalDate;

// Type your code
public class Bus
{
	private int noOfPersons;
	private String busType;
	private int rate;
	private LocalDate date;
	
	
	public Bus(int noOfPersons, String busType, int rate, LocalDate date) {
		super();
		this.noOfPersons = noOfPersons;
		this.busType = busType;
		this.rate = rate;
		this.date = date;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}