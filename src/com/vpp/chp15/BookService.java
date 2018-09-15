package com.vpp.chp15;


public interface BookService {
	void createNewBook(Book book) throws BookAlreadyExistException;
	Book getBookByIsbn(String isbn) throws BookNotFoundException;
	void deleteBook(Book book) throws BookNotFoundException;
}