package com.vpp.chp3.ex2.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.vpp.chp3.ex2.domain.Book;

public class BookServiceMockImpl implements BookService {
	
	private Map<String, Book> bookDB = new HashMap<>();
	
	public BookServiceMockImpl() {
		bookDB.put("ISB12", new Book("Book1", "ISB12", "Author1", new BigDecimal(12)));
		bookDB.put("ISB13", new Book("Book2", "ISB13", "Author2", new BigDecimal(25)));
		bookDB.put("ISB14", new Book("Book3", "ISB14", "Author3", new BigDecimal(50)));
		bookDB.put("ISB15", new Book("Book4", "ISB15", "Author4", new BigDecimal(100)));
	}
	
	
	@Override
	public Book getBookByISBN(String isbn) {
		return bookDB.get(isbn);
	}

	@Override
	public Book getBookByAuthor(String author) {
		return bookDB.values().stream().filter(a->a.getAuthor().equals(author)).findAny().orElse(null);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookDB.values().stream().collect(Collectors.toList());
	}

	@Override
	public void createBook(Book book) {
		bookDB.put(book.getIsbn(), book);
	}

}
