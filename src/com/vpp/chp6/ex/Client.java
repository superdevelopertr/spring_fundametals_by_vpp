package com.vpp.chp6.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vpp.chp6.ex.domain.Book;
import com.vpp.chp6.ex.service.BookService;
import com.vpp.chp6.ex.service.PurchaseService;

public class Client {
	public static void main(String[] args) {
		System.out.println("buying a book...");
		
		Book book = new Book("Kurtlar Imparatorlugu", "ISDN123", "Grange", 12);
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application_chp6_ex.properties");
//		BookService bookService=container.getBean(BookService.class);
//		bookService.registerBook(book);
		
		PurchaseService purchase=container.getBean(PurchaseService.class);
		purchase.purchase("ISDN123");
		
		PurchaseService purchase2=container.getBean(PurchaseService.class);

		PurchaseService purchase3=container.getBean(PurchaseService.class);

		PurchaseService purchase4=container.getBean(PurchaseService.class);

	
		container.close();
	}
}
