package com.vpp.chp11.ex3.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CustomerDAOJdbcTemplateImpl implements CustomerDao {

	private JdbcTemplate jdbcTemplate;

	public CustomerDAOJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void create(Customer customer) {
		jdbcTemplate.update("INSERT INTO public.customer(customer_id, customer_name, company_name, email, phone, notes) values(?,?,?,?,?,?)", 
				customer.getCustomerId(), customer.getCustomerName(),customer.getCompanyName(), customer.getEmail(), customer.getTelephone(), customer.getNotes());
	}

	@Override
	public Customer getById(String customerId) throws RecordNotFoundException {
		try {
			return jdbcTemplate.queryForObject("select * from public.customer where customer_id=?", new Object[]{customerId}, new CustomerRowMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new RecordNotFoundException();
		}
	}

	@Override
	public List<Customer> getByName(String name) {
		return jdbcTemplate.query("select * from public.customer where customer_name=?", new CustomerRowMapper());
	}

	@Override
	public void update(Customer customerToUpdate) throws RecordNotFoundException {
		getById(customerToUpdate.getCustomerId());
		
		jdbcTemplate.update("update public.customer set customer_name=?, company_name=?, email=?, phone=?, notes=? where customer_id=?", 
				customerToUpdate.getCustomerName(), customerToUpdate.getCompanyName(), customerToUpdate.getEmail(), customerToUpdate.getTelephone(),
				customerToUpdate.getNotes(), customerToUpdate.getCustomerId());
	}

	@Override
	public void delete(Customer oldCustomer) throws RecordNotFoundException {
		getById(oldCustomer.getCustomerId());
		
		jdbcTemplate.update("delete from public.customer where customer_id=?", oldCustomer.getCustomerId());
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
		getById(customerId);
		
		jdbcTemplate.update("insert into public.Call(id, time_and_date, notes, customer_id)  values(?,?,?,?)", newCall.getId(), newCall.getTimeAndDate(), newCall.getNotes(), customerId);

	}

}

class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Customer(rs.getString("customer_id"), rs.getString("customer_name"),  rs.getString("company_name"), rs.getString("email"),
				rs.getString("phone"), rs.getString("notes"));
	}
}