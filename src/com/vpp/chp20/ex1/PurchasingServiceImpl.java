package com.vpp.chp20.ex1;

import org.springframework.transaction.annotation.Transactional;

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
	@Transactional(rollbackFor= {InvalidCreditException.class,BookNotFoundException.class})
	public void buy(Book book) throws InvalidCreditException, BookNotFoundException {
		bookService.deleteBook(book.getIsbn());

		accountService.raiseInvoice(new Invoice(1, book.getIsbn(), "satin alindi"));
		//		try {
//			throw new NullPointerException("asdsad");

//		} catch (Exception e) {
//			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
//		}
	}
}
