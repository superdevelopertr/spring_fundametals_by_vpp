package com.vpp.chp20.ex2;

public interface AccountService {
	void raiseInvoice(Invoice invoice) throws InvalidCreditException;
}