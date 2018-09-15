package com.vpp.chp15;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	 public static Logger Log = Logger.getLogger("abdullah");
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("chp15.xml");
		
		BookService bs = container.getBean(BookService.class);
	
//		try {
//			bs.createNewBook(new Book("vvv", "Book1", "Author1"));
//		} catch (BookAlreadyExistException e1) {
//			System.out.println("Sorry this book is already exist");
//		}
	
		
//		PurchasingService service = container.getBean(PurchasingService.class);
//		try {
//			service.buy(new Book("666", "Book1", "Author1"));
//		} catch (Exception e) {
//			System.out.println("sorry this book is not found!");
//		}
		
//		try {
//			Book book =bs.getBookByIsbn("666");
//			System.out.println(book);
//		} catch (BookNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			bs.createNewBook(new Book("uuuu", "Book1", "Author1"));
		} catch (BookAlreadyExistException e1) {
			System.out.println("Sorry this book is already exist");
		}
		container.close();
	}
}
