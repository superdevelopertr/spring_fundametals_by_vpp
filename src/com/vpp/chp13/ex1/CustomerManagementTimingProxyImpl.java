package com.vpp.chp13.ex1;

import java.util.List;

public class CustomerManagementTimingProxyImpl implements CustomerManagementService {

	private CustomerManagementService cms;

	public CustomerManagementTimingProxyImpl(CustomerManagementService cms) {
		this.cms = cms;
	}

	@Override
	public void newCustomer(Customer newCustomer) {
		long before = System.currentTimeMillis();
		cms.newCustomer(newCustomer);
		System.out.println(System.currentTimeMillis()-before+" is passed in newCustomer");
	}

	@Override
	public void updateCustomer(Customer changedCustomer) throws CustomerNotFoundException {
		long before = System.currentTimeMillis();
		cms.updateCustomer(changedCustomer);
		System.out.println(System.currentTimeMillis()-before+" is passed in updateCustomer");
	}

	@Override
	public void deleteCustomer(Customer oldCustomer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public Customer findCustomerById(String customerId) throws CustomerNotFoundException {
		long before = System.currentTimeMillis();
		try {
			return cms.findCustomerById(customerId);
		} finally{
			System.out.println(System.currentTimeMillis()-before+" is passed in findCustomerById");
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
		// TODO Auto-generated method stub

	}

}
