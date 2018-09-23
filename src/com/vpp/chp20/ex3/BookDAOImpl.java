package com.vpp.chp20.ex3;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.MANDATORY)
@Repository
public class BookDAOImpl implements BookDAO {

	private JdbcTemplate jdbcTemplate;
	
	public BookDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertBook(Book book)throws RecordAlreadyExistException {
		
		try {
			if(findByIsbn(book.getIsbn())!=null){
				throw new RecordAlreadyExistException();
			}
		} catch (RecordNotFoundException e) {
		}

		jdbcTemplate.update("insert into book(isbn,name,author) values(?,?,?)", book.getIsbn(), book.getName(), book.getAuthor());
	}

	@Override
	public Book findByIsbn(String isbn) throws RecordNotFoundException{
		try {
			return jdbcTemplate.queryForObject("select * from Book where isbn=?", new Object[]{isbn}, 
					(rs,r)-> new Book(rs.getString("isbn"), rs.getString("name"), rs.getString("author")));
		} catch (EmptyResultDataAccessException e) {
			throw new RecordNotFoundException(); 
		}
	}

	@Override
	public void deleteBook(String isbn) throws RecordNotFoundException{
		findByIsbn(isbn); 
		jdbcTemplate.update("delete from book where isbn=?", isbn);
	}

	@Override
	public void doSomething() {
		jdbcTemplate.update("drop table table1");
	}
}
