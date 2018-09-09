package com.vpp.chp14.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vpp.chp14.domain.Invoice;

public class AccountDAOImpl implements AccountDAO {
	private JdbcTemplate jdbcTemplate;

	public AccountDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertInvoice(Invoice invoice) {
		jdbcTemplate.update("insert into public.invoce(invoice_id, isbn, details) values(?,?,?)", invoice.getInvoiceId(), invoice.getIsbn(), invoice.getIsbn());
	}
}