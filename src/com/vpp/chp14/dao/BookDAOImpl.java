package com.vpp.chp14.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vpp.chp14.domain.Book;
import com.vpp.chp14.exception.RecordAlreadyExist;
import com.vpp.chp14.exception.RecordNotFound;

public class BookDAOImpl implements BookDAO {

	private JdbcTemplate jdbcTemplate;

	public BookDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertBook(Book book)throws RecordAlreadyExist {
		
		try {
			if(findByIsbn(book.getIsbn())!=null){
				throw new RecordAlreadyExist();
			}
		} catch (RecordNotFound e) {
		}

		jdbcTemplate.update("insert into public.book(isbn,name,author) values(?,?,?)", book.getIsbn(), book.getName(), book.getAuthor());
	}

	@Override
	public Book findByIsbn(String isbn) throws RecordNotFound{
		try {
			return jdbcTemplate.queryForObject("select * from public.Book where isbn=?", new Object[]{isbn}, 
					(rs,r)-> new Book(rs.getString("isbn"), rs.getString("name"), rs.getString("author")));
		} catch (EmptyResultDataAccessException e) {
			throw new RecordNotFound();
		}
	}
}
