package com.vpp.chp14.service;

import com.vpp.chp14.domain.Book;
import com.vpp.chp14.exception.BookAlreadyExist;
import com.vpp.chp14.exception.BookNotFound;

public interface BookService {
	void createNewBook(Book book) throws BookAlreadyExist;
	Book getBookByIsbn(String isbn) throws BookNotFound;
}