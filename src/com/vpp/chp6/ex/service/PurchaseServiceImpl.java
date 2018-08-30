package com.vpp.chp6.ex.service;

import com.vpp.chp6.ex.domain.Book;

public class PurchaseServiceImpl implements PurchaseService {

	private BookService books;
	private AccountService accounts;

	public PurchaseServiceImpl( BookService books, AccountService accounts) {
		System.out.println("purchase service is created");
		this.books = books;
		this.accounts = accounts;
	}

	public void setBooks(BookService books) {
		this.books = books;
	}

	public void setAccounts(AccountService accounts) {
		this.accounts = accounts;
	}

	@Override
	public void purchase(String isdn) {
		Book book = books.findByISDN(isdn);

		if (book != null) {
			accounts.raiseInvoice(book);
		} else {
			System.out.println("there is no book for isdn=" + isdn);
		}
	}
}