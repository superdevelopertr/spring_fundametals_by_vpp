package com.vpp.chp2.v1;

public class InvoiceService {

	//If We change DAO implementation, these methods need re-test!
 	//and We can write unit test because of hard coded coupling.
	
	public void createInvoice(Invoice invoice) {
		InvoiceJDBCDAO dao = new InvoiceJDBCDAO();
		dao.insertInvoice(invoice);
	}

	public void deleteInvoice(Invoice invoice) {
		InvoiceJDBCDAO dao = new InvoiceJDBCDAO();
		dao.deleteInvoice(invoice);
	}

	public void updateInvoice(Invoice invoice) {
		InvoiceJDBCDAO dao = new InvoiceJDBCDAO();
		dao.updateInvoice(invoice);
	}
}