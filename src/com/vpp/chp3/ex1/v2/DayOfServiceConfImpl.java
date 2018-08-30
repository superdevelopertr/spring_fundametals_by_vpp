package com.vpp.chp3.ex1.v2;

public class DayOfServiceConfImpl implements DayOfService {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
