package com.vpp.chp6.ex.service;

import java.util.List;

import com.vpp.chp6.ex.domain.Book;

public interface BookService {
	void registerBook(Book book);

	List<Book> getAllBooks();

	Book findByISDN(String isdn);
}
