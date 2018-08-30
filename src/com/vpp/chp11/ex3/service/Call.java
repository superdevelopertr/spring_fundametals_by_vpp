package com.vpp.chp11.ex3.service;

import java.util.Date;


public class Call 
{
	
	private int id;
	
	/**
	 * Records the time and date of the call. If you want
	 * to change the type for something better (like Calendar or even
	 * something better like http://joda-time.sourceforge.net/)
	 */
	private Date timeAndDate;
	
	/**
	 * General notes about the call
	 */
	private String notes;
	
	/**
	 * Constructor for Call
	 * @param notes eg "Martha from Acme Corp Called etc"
	 */
	public Call(String notes)
	{
		// this defaults to a timestamp of "now"
		this (notes, new java.util.Date());
	}
	
	/**
	 * Constructor for Call if the automatic timestamp needs to be overridden
	 */
	public Call(String notes, Date timestamp)
	{
		// this defaults to a timestamp of "now"
		this.timeAndDate = timestamp;	
		this.notes = notes;
	}
	
	
	/**
	 * A simple toString
	 */
	public String toString()
	{
		return this.timeAndDate + " : " + this.notes;
	}

	public Date getTimeAndDate() {
		return timeAndDate;
	}

	public void setTimeAndDate(Date timeAndDate) {
		this.timeAndDate = timeAndDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	// needed for JPA - ignore until then
	public Call() {}
}
