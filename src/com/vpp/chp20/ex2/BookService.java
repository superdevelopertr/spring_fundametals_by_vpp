package com.vpp.chp20.ex2;


public interface BookService {
	void createNewBook(Book book) throws BookAlreadyExistException;
	Book getBookByIsbn(String isbn) throws BookNotFoundException;
	void deleteBook(String isbn) throws BookNotFoundException;
	
	void doSomething() throws BookNotFoundException;
}