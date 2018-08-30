package com.vpp.chp2.v4;

public class InvoiceServiceImpl implements InvoiceService{
	private InvoiceDAO dao;
	
	public InvoiceServiceImpl(InvoiceDAO dao){
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