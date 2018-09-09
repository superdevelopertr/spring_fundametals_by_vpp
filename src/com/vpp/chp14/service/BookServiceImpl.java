package com.vpp.chp14.service;

import com.vpp.chp14.dao.BookDAO;
import com.vpp.chp14.domain.Book;
import com.vpp.chp14.exception.BookAlreadyExist;
import com.vpp.chp14.exception.BookNotFound;
import com.vpp.chp14.exception.RecordNotFound;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;

	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	@Override
	public void createNewBook(Book book) throws BookAlreadyExist {
		try {
			bookDAO.insertBook(book);
		} catch (Exception e) {
			throw new BookAlreadyExist();
		}
	}

	@Override
	public Book getBookByIsbn(String isbn) throws BookNotFound {
		try {
			return bookDAO.findByIsbn(isbn);
		} catch (RecordNotFound e) {
			throw new BookNotFound();
		}
	}

}
