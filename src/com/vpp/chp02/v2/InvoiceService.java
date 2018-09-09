package com.vpp.chp02.v2;

//They are still coupled.We need give dependency via parameter.
public class InvoiceService {
	private InvoiceJDBCDAO dao = new InvoiceJDBCDAO();
	
	public void createInvoice(Invoice invoice) {
		dao.insertInvoice(invoice);
	}

	public void deleteInvoice(Invoice invoice) {
		dao.deleteInvoice(invoice);
	}

	public void updateInvoice(Invoice invoice) {
		dao.updateInvoice(invoice);
	}
}