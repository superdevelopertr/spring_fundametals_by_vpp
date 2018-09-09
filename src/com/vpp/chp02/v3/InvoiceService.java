package com.vpp.chp02.v3;

//They are still coupled.We need give dependency via parameter.
//Client needs to configure service and be aware of DAO class! It violates SRP
//but we need to give these dependency hard coded. Image hundreds of classes uses same dependency!. 
//And in case implementation change we still need re-test this class.
public class InvoiceService {
	private InvoiceJDBCDAO dao;
	
	public InvoiceService(InvoiceJDBCDAO dao){
		this.dao = dao;
	}
	
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