package com.vpp.chp11.ex.service;

public class BookNotFoundException extends Exception {
	private String isdn;

	public BookNotFoundException(String isdn) {
		super();
		this.isdn = isdn;
	}
	
	public String getIsdn() {
		return isdn;
	}
}
