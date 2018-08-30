package com.vpp.chp3.ex1.v4;

import java.time.LocalDate;

public class DayOfServiceDynamicConfImpl implements DayOfService {
	
	private String[] messages;
	
	public void setMessages(String[] messages) {
		this.messages = messages;
	}
	
	@Override
	public String getMessage() {
		int day=LocalDate.now().getDayOfWeek().getValue();
		
		return messages[day];
	}
}
