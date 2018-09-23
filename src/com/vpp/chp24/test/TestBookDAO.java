package com.vpp.chp24.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vpp.chp24.Book;
import com.vpp.chp24.BookDAO;
import com.vpp.chp24.ResultNotFoundException;

public class TestBookDAO {

	@Test
	public void test_createBook(Book book){
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("chp24.xml");
		BookDAO dao = container.getBean(BookDAO.class);
		
		Book newBook =new Book("kurtlar", "grange");
		int id = dao.createBook(newBook);
		Book foundBook= dao.getBook(id);
		
		assertEquals(foundBook, newBook);
	}
	
	@Test
	public void test_getBook(int bookId){
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("chp24.xml");
		BookDAO dao = container.getBean(BookDAO.class);
		
		Book book = dao.getBook(1);
		container.close();
	}
	
	@Test
	public void  test_getAll(){
		
	}
	
	@Test
	public void test_findBookByAuthor(String author) throws ResultNotFoundException{
		
	}
}
