package com.vpp.chp14.dao;

import com.vpp.chp14.domain.Book;
import com.vpp.chp14.exception.RecordAlreadyExist;
import com.vpp.chp14.exception.RecordNotFound;

public interface BookDAO {
	void insertBook(Book book)throws RecordAlreadyExist;
	Book findByIsbn(String isbn) throws RecordNotFound;
}
