package com.vpp.chp09.ex.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		System.out.println("buying a book...");
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("chp9.xml");
		
		BookService bookService=container.getBean(BookService.class);
		
		
		Book book = new Book("Kurtlar Imparatorlugu 2", "ISDN124", "Grange", 30);
		bookService.registerBook(book);
		
		bookService.getAllBooks().stream().forEach(System.out::println);

	
		container.close();
	}
}
