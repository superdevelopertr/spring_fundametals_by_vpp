package com.vpp.chp11.ex3.service;

import java.util.List;


public class CustomerManagementServiceImpl implements CustomerManagementService {

	private CustomerDao customerDAO;

	public CustomerManagementServiceImpl(CustomerDao customerDAO) {
		super();
		this.customerDAO = customerDAO;
	}

	@Override
	public void newCustomer(Customer newCustomer) {
		customerDAO.create(newCustomer);
	}

	@Override
	public void updateCustomer(Customer changedCustomer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(Customer oldCustomer) {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findCustomersByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getFullCustomerDetail(String customerId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recordCall(String customerId, Call callDetails) throws CustomerNotFoundException {
		// TODO Auto-generated method stub

	}

}
