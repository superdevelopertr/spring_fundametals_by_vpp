package com.vpp.chp11.ex.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BookServiceRealImpl implements BookService {

	private JdbcTemplate jdbcTemplate;

	public BookServiceRealImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void registerBook(Book book) {
		jdbcTemplate.update("INSERT INTO public.\"Book\"(isdn, name, author, price)VALUES (?, ?, ?, ?);", book.getIsdn(), book.getName(), book.getAuthor(), book.getPrice());
	}

	@Override
	public List<Book> getAllBooks() {
		return jdbcTemplate.query("select * from public.\"Book\"", new BookMapper());
	}

	@Override
	public Book findByISDN(String isdn) throws BookNotFoundException {
		try {
			return jdbcTemplate.queryForObject("select * from public.\"Book\" where isdn=?", new BookMapper(), isdn);
		} catch (EmptyResultDataAccessException e) {
			throw new BookNotFoundException(isdn);
		}
	}

}

class BookMapper implements RowMapper<Book>{
	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Book(rs.getString("name"), rs.getString("isdn"), rs.getString("author"), rs.getFloat("price"));
	}	
}
