package com.vpp.chp09.ex.service;

import java.util.List;

public interface BookService {
	void registerBook(Book book);

	List<Book> getAllBooks();

	Book findByISDN(String isdn);
}