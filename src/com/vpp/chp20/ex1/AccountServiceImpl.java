package com.vpp.chp20.ex1;

public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;

	public AccountServiceImpl(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}
	@Override
	public void raiseInvoice(Invoice invoice) throws InvalidCreditException {
		 
		//throw new InvalidCreditException();
		accountDAO.insertInvoice(invoice);
	}
}
