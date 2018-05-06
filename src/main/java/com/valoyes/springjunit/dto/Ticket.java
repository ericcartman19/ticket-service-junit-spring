package com.valoyes.springjunit.dto;

public class Ticket {

	private String passengerName;
	
	private String phone;


	public Ticket(String passengerName, String phone) {
		this.passengerName = passengerName;
		this.phone = phone;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
