package com.vpp.chp20.ex3;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;

	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	@Override
	@Transactional
	public void createNewBook(Book book) throws BookAlreadyExistException {
		try { 
			bookDAO.insertBook(book);
		} catch (RecordAlreadyExistException e) {
			throw new BookAlreadyExistException();
		}
	}

	@Override
	@Transactional(readOnly=true)
	public Book getBookByIsbn(String isbn) throws BookNotFoundException {
		try {
			Book book= bookDAO.findByIsbn(isbn);
			bookDAO.deleteBook(isbn);
			return book;
		} catch (RecordNotFoundException e) {
			throw new BookNotFoundException();
		}
	}

	@Override
	public void deleteBook(String isbn)throws BookNotFoundException {
		
		try {
			 bookDAO.deleteBook(isbn);
		} catch (RecordNotFoundException e) {
			throw new BookNotFoundException();
		}
	}

	//@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public void doSomething() throws BookNotFoundException {
		bookDAO.doSomething();
	}

}
