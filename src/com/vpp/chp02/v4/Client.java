package com.vpp.chp02.v4;

import java.time.LocalDate;

public class Client {
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, LocalDate.now(), "Abdullah Ilhanli");
		
		InvoiceService is = InvoiceFactory.createInvoiceService();
		is.createInvoice(invoice);
		is.deleteInvoice(invoice);
		is.updateInvoice(invoice);
	}
}
