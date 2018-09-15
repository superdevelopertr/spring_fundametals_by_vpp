package com.vpp.chp18;

public interface AccountService {
	void raiseInvoice(Invoice invoice) throws InvalidCreditException;
}