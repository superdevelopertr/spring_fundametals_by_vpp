package com.vpp.chp20.ex1;


public interface BookDAO {
	void insertBook(Book book)throws RecordAlreadyExistException;
	Book findByIsbn(String isbn) throws RecordNotFoundException;
	void deleteBook(String isbn)throws RecordNotFoundException;
	void doSomething();
}
