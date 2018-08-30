package com.vpp.chp6.ex.service;

import com.vpp.chp6.ex.domain.Book;

public class AccountServiceImpl implements AccountService {
	public AccountServiceImpl() {
		System.out.println("account service is created");
	}
	
	@Override
	public void raiseInvoice(Book book) {
		System.out.println("Invoice is raised for "+book);
	}
}