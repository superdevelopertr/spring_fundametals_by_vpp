package com.vpp.chp03.ex2.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vpp.chp03.ex2.service.BookService;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application_chp3_ex2.properties");
		
		BookService service =container.getBean(BookService.class);
		service.getAllBooks().forEach(System.out::println);
		
		container.close();
	}

}
