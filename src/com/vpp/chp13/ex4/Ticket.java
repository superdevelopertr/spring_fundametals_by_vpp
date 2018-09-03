package com.vpp.chp13.ex4;

import java.util.Date;

public class Ticket {
	private String pnr;

	private String passenger;

	private Date flightTime;

	public Ticket(String pnr, String passenger, Date flightTime) {
		super();
		this.pnr = pnr;
		this.passenger = passenger;
		this.flightTime = flightTime;
	}

	public String getPnr() {
		return pnr;
	}

	public String getPassenger() {
		return passenger;
	}

	public Date getFlightTime() {
		return flightTime;
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", passenger=" + passenger + ", flightTime=" + flightTime + "]";
	}
}