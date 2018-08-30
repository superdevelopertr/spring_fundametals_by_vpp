package com.vpp.chp2.v2;

public class InvoiceJDBCDAO {

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