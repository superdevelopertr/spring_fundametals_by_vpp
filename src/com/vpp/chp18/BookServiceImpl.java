package com.vpp.chp18;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;

	public BookServiceImpl(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	@Override
	@Transactional(timeout=3)
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
	@Transactional(propagation=Propagation.NESTED)
	public void deleteBook(String isbn)throws BookNotFoundException {
		
		try {
			 bookDAO.deleteBook(isbn);
			 TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
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
