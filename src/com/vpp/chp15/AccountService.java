package com.vpp.chp15;

public interface AccountService {
	void raiseInvoice(Invoice invoice) throws InvalidCreditException;
}