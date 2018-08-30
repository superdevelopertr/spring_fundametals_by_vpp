package com.vpp.chp11.ex2.service;

import java.util.List;

public interface BookService {
	void registerBook(Book book);

	List<Book> getAllBooks();

	Book findByISDN(String isdn) throws BookNotFoundException;
}