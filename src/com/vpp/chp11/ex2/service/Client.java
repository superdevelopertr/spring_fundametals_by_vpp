package com.vpp.chp11.ex2.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		System.out.println("buying a book...");
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("chp11.xml");
		
		BookService bookService=container.getBean(BookService.class);
		
		try {
			bookService.findByISDN("121aas");
		} catch (BookNotFoundException e) {
			System.out.println("Sorry that book is not found. Isdn is "+e.getIsdn());
		}
		
		container.close();
	}
}
