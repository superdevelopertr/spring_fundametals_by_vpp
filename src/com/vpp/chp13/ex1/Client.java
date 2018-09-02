package com.vpp.chp13.ex1;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("cph13.xml");
		CustomerManagementService cms = container.getBean("customerManService",CustomerManagementService.class);
		
		try {
			//cms.newCustomer(new Customer("C123", "Berkin Bozkus", "Amadeus", "berkin.bozkus@amadeus.com", "5301721008", "good guy"));

			Customer customerToUpdate=cms.findCustomerById("C123");
			System.out.println(customerToUpdate);
			
			customerToUpdate.setCustomerName("AbdullahI");
			
			cms.updateCustomer(customerToUpdate);
			
			//cms.recordCall("C123", new Call(1, new Date(), "test call", "C123"));
			
			//cms.deleteCustomer(customerToUpdate);
			
		} catch (CustomerNotFoundException e) {
			System.out.println("Oops customer is not founded");
		}
		
		
	}
}
