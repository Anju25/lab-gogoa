package model;
// Type your code

import java.time.LocalDate;

public class Train
{
	private int noOfPersons;
	private String berth;
	private int rate;
	private LocalDate date;
	
	
	public Train(int noOfPersons, int rate, String berth, LocalDate date) {
		super();
		this.noOfPersons = noOfPersons;
		this.berth = berth;
		this.rate = rate;
		this.date = date;
	}
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public String getBerth() {
		return berth;
	}
	public void setBerth(String berth) {
		this.berth = berth;
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