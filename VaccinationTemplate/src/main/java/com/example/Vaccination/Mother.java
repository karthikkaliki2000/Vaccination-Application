package com.example.Vaccination;

import com.example.Vaccination.User;


public class Mother implements User {
	String name;
    int age;
    boolean isVaccinated;
    TimeAndLocation timeAndLocation;
    Vaccine vaccine;
    public void setTimeAndLocation(TimeAndLocation timeAndLocation) {
		this.timeAndLocation = timeAndLocation;
	}
	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}
//    public Mother(TimeAndLocation timeAndLocation,Vaccine vaccine) {
//    	this.timeAndLocation=timeAndLocation;
//    	this.vaccine=vaccine;
//    }
	@Override
	public Vaccine getVaccineDetails() {
		// TODO Auto-generated method stub
		return this.vaccine;
	}

	@Override
	public void setUserDetails(String name, int age, TimeAndLocation timeAndLocation) {
		// TODO Auto-generated method stub
		this.name=name;
		this.age=age;
		this.timeAndLocation=timeAndLocation;
		
	}

	@Override
	public void setAppointment() {
		// TODO Auto-generated method stub
		isVaccinated=true;
		System.out.println("Hello "+this.name+" your appointment has been fixed for "+vaccine.getType()+" Vaccine on "+timeAndLocation.timeSlot+" at "+timeAndLocation.location+" on "+timeAndLocation.date);
	}

	@Override
	public boolean IsVaccinated() {
		// TODO Auto-generated method stub
		
		return isVaccinated;
		
	}


}
