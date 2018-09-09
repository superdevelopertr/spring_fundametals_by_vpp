package com.vpp.chp14.service;

import org.springframework.transaction.annotation.Transactional;

import com.vpp.chp14.domain.Book;
import com.vpp.chp14.domain.Invoice;
import com.vpp.chp14.exception.BookAlreadyExist;

@Transactional
public class PurchasingServiceImpl implements PurchasingService {

	private BookService bookService;
	private AccountService accountService;

	public PurchasingServiceImpl(BookService bookService, AccountService accountService) {
		super();
		this.bookService = bookService;
		this.accountService = accountService;
	}

	@Override
	public void buy(Book book) {
		try {
			bookService.createNewBook(book);
			accountService.raiseInvoice(new Invoice(1, book.getIsbn(), "satin alindi"));
		} catch (BookAlreadyExist e) {
			e.printStackTrace();
		}
	}
}
