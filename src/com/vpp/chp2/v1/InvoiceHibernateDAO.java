package com.vpp.chp2.v1;

public class InvoiceHibernateDAO {

	public void insertInvoice(Invoice invoice){
		System.out.println("invoice is created via hibernate");
	}
	
	public void deleteInvoice(Invoice invoice){
		System.out.println("invoice is deleted via hibernate");
	}
	
	public void updateInvoice(Invoice invoice){
		System.out.println("invoice is updated via hibernate");
	}
}