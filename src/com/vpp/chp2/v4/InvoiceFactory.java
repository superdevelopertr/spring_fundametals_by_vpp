package com.vpp.chp2.v4;

//we program to interface
//we give collaborators as parameters via constructor
//we manage dependency in a single place.
//BUT it is not easy to manage all dependency in a single place. 
//Creation logic will be complex and unmanagable and error-prone
//We need a container to manage object creation and configuration.

public class InvoiceFactory {

	public static InvoiceService createInvoiceService(){
		InvoiceDAO dao = new InvoiceJDBCDAOImpl();
		InvoiceService service = new InvoiceServiceImpl(dao);
		return service;
	}
}
