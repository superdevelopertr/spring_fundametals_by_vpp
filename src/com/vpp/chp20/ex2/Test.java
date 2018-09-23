package com.vpp.chp20.ex2;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	 public static Logger Log = Logger.getLogger("abdullah");
	
	public static void main(String[] args) throws BookNotFoundException {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("chp20.2.xml");
		
		BookService bs = container.getBean(BookService.class);
		try {
			bs.createNewBook(new Book("4567", "book1", "author1"));
		} catch (BookAlreadyExistException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PurchasingService ps = container.getBean(PurchasingService.class);
		try {
			ps.buy(new Book("4567", "book1", "author1"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//bs.doSomething();
		
		
//		BookDAO dao = container.getBean(BookDAO.class);
//		try {
//			dao.deleteBook("4567");
//		} catch (RecordNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		container.close();
	}
}
