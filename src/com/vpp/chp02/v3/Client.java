package com.vpp.chp02.v3;

import java.time.LocalDate;


public class Client {
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, LocalDate.now(), "Abdullah Ilhanli");
		
		InvoiceService is = new InvoiceService(new InvoiceJDBCDAO());
		is.createInvoice(invoice);
		is.deleteInvoice(invoice);
		is.updateInvoice(invoice);
	}
}
