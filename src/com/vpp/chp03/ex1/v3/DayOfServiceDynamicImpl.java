package com.vpp.chp03.ex1.v3;

import java.time.LocalDate;

public class DayOfServiceDynamicImpl implements DayOfService {
	
	private String[] messages={
		"Hello Monday!",
		"Tuesday",
		"Wednesday",
		"Thursday",
		"Friday",
		"Saturday",
		"Sunday"
	};
	
	@Override
	public String getMessage() {
		int day=LocalDate.now().getDayOfWeek().getValue();
		
		return messages[day];
	}
}
