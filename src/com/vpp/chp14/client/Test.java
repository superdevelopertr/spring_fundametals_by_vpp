package com.vpp.chp14.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vpp.chp14.domain.Book;
import com.vpp.chp14.service.PurchasingService;


public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("chp14.1.xml");
		
		PurchasingService service = container.getBean(PurchasingService.class);
		service.buy(new Book("ISB1212", "Book1", "Author1"));
		container.close();
	}
}
