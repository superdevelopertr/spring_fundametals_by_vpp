package com.vpp.chp13.ex5;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container  = new ClassPathXmlApplicationContext("chp13.5.xml");
		TicketService ts =container.getBean(TicketService.class);
		
		try {
			ts.newTicket(new Ticket("T0","Abdullah Ilhanli", new Date()));
		} catch (TicketAlreadyExistException e) {
			e.printStackTrace();
		}
		
		try {
			ts.getTicketByPnr("T123");
		} catch (TicketNotFoundException e) {
			e.printStackTrace();
		}
		
		ts.getAllTickets().stream().forEach(System.out::println);
		
		container.close();
	}
}
