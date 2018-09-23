package com.vpp.chp20.ex3;


public interface BookDAO {
	void insertBook(Book book)throws RecordAlreadyExistException;
	Book findByIsbn(String isbn) throws RecordNotFoundException;
	void deleteBook(String isbn)throws RecordNotFoundException;
	void doSomething();
}
