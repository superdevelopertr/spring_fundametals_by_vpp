package com.vpp.chp6.ex.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vpp.chp6.ex.domain.Book;

public class BookServiceMockImpl implements BookService {

	private Map<String, Book> db = new HashMap<>();
	
	public BookServiceMockImpl() {
		System.out.println("book service is created");
	}
	
	@Override
	public void registerBook(Book book) {
		System.out.println(book+" is registered");
		db.put(book.getIsdn(), book);
	}

	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<>(db.values());
	}

	@Override
	public Book findByISDN(String isdn) {
		return db.get(isdn);
	}
}