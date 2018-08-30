package com.vpp.chp11.ex3.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDAOJdbcTemplateImpl implements CustomerDao {

	private JdbcTemplate jdbcTemplate;

	public CustomerDAOJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void create(Customer customer) {
		jdbcTemplate.update("INSERT INTO public.customer values(?,?,?,?,?)", customer.getCustomerId(),
				customer.getCompanyName(),customer.getEmail(), customer.getTelephone(), customer.getNotes());
	}

	@Override
	public Customer getById(String customerId) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Customer customerToUpdate) throws RecordNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Customer oldCustomer) throws RecordNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getFullCustomerDetail(String customerId) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCall(Call newCall, String customerId) throws RecordNotFoundException {
		// TODO Auto-generated method stub

	}

}
