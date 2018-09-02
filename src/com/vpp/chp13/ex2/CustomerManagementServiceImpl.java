package com.vpp.chp13.ex2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


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
	public void updateCustomer(Customer changedCustomer) throws CustomerNotFoundException {
		try {
			customerDAO.update(changedCustomer);
		} catch (Exception e) {
			throw new CustomerNotFoundException();
		}
	}

	@Override
	public void deleteCustomer(Customer oldCustomer) throws CustomerNotFoundException {
		try {
			customerDAO.delete(oldCustomer);
		} catch (RecordNotFoundException e) {
			throw new CustomerNotFoundException();
		}
	}

	@Override
	public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
		try {
			return customerDAO.getById(customerId);
		} catch (RecordNotFoundException e) {
			throw new CustomerNotFoundException();
		}
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
		try {
			customerDAO.addCall(callDetails, customerId);
		} catch (RecordNotFoundException e) {
			throw new CustomerNotFoundException();
		}
	}

}
