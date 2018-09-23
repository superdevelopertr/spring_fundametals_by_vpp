package com.vpp.chp24;

import java.util.List;

public interface BookDAO {
	int createBook(Book book);
	
	Book getBook(int bookId);
	
	List<Book> getAll();
	
	Book findBookByAuthor(String author) throws ResultNotFoundException;
}
