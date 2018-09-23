package com.vpp.chp20.ex3;

public interface AccountService {
	void raiseInvoice(Invoice invoice) throws InvalidCreditException;
}