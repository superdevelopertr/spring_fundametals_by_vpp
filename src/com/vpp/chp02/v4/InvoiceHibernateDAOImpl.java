package com.vpp.chp02.v4;

public class InvoiceHibernateDAOImpl implements InvoiceDAO{

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