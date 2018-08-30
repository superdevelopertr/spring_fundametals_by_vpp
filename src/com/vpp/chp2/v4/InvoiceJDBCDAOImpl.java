package com.vpp.chp2.v4;

public class InvoiceJDBCDAOImpl implements InvoiceDAO{

	public void insertInvoice(Invoice invoice){
		System.out.println("invoice is created via jdbc");
	}
	
	public void deleteInvoice(Invoice invoice){
		System.out.println("invoice is deleted via jdbc");
	}
	
	public void updateInvoice(Invoice invoice){
		System.out.println("invoice is updated via jdbc");
	}
}