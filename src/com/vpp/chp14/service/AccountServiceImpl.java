package com.vpp.chp14.service;

import com.vpp.chp14.dao.AccountDAO;
import com.vpp.chp14.domain.Invoice;

public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;

	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}
	@Override
	public void raiseInvoice(Invoice invoice) {
		accountDAO.insertInvoice(invoice);
	}
}
