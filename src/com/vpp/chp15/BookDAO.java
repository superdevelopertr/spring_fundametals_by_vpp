package com.vpp.chp15;


public interface BookDAO {
	void insertBook(Book book)throws RecordAlreadyExistException;
	Book findByIsbn(String isbn) throws RecordNotFoundException;
	void deleteBook(Book book)throws RecordNotFoundException;
}
