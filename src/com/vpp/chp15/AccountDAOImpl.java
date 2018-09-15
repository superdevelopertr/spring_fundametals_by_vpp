package com.vpp.chp15;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDAOImpl implements AccountDAO {
	private JdbcTemplate jdbcTemplate;

	public AccountDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertInvoice(Invoice invoice) {
		jdbcTemplate.update("insert into invoice(invoice_id, isbn, details) values(?,?,?)", invoice.getInvoiceId(), invoice.getIsbn(), invoice.getIsbn());
	}
}