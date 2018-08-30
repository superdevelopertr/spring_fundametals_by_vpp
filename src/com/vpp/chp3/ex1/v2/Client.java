package com.vpp.chp3.ex1.v2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application_chp3_ex1_v2.properties");
		
		DayOfService dos =ac.getBean(DayOfService.class);
		
		System.out.println(dos.getMessage());
		
		ac.close();
	}

}
