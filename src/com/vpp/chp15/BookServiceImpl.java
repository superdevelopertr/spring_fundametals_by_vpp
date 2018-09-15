package com.vpp.chp15;

import org.springframework.transaction.annotation.Transactional;

@Transactional
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
			bookDAO.deleteBook(book);
			return book;
		} catch (RecordNotFoundException e) {
			throw new BookNotFoundException();
		}
	}

	@Override
	public void deleteBook(Book book)throws BookNotFoundException {
		
		try {
			 bookDAO.deleteBook(book);
		} catch (RecordNotFoundException e) {
			throw new BookNotFoundException();
		}
	}

}
