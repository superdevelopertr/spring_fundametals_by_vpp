package com.vpp.chp20.ex1;

public interface AccountService {
	void raiseInvoice(Invoice invoice) throws InvalidCreditException;
}