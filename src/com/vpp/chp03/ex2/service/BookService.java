package com.vpp.chp03.ex2.service;

import java.util.List;

import com.vpp.chp03.ex2.domain.Book;

public interface BookService {
	
	Book getBookByISBN(String isbn);
	Book getBookByAuthor(String author);
	List<Book> getAllBooks();
	void createBook(Book book);

}
