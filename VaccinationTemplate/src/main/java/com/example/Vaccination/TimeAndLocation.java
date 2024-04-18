package com.example.Vaccination;


public class TimeAndLocation {
	String timeSlot;
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setDate(String date) {
		this.date = date;
	}
	String location;
	String date;
	public void setDetails(String timeSlot,String location,String date) {
		
		this.timeSlot=timeSlot;
		this.location=location;
		this.date=date;
		
	}
	public String getDetails(){
		return this.timeSlot+" at "+this.location+" on "+this.date;
	}
}
