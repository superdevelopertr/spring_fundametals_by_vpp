package com.vpp.chp24;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BookDAOImpl implements BookDAO {

	private final HibernateTemplate hibernateTemplate;

	public BookDAOImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int createBook(Book book) {
		return (int)hibernateTemplate.save(book);
	}

	@Override
	public Book getBook(int bookId) {
		return (Book)hibernateTemplate.get(Book.class, bookId);
	}

	@Override
	public List<Book> getAll() {
		return (List<Book> )hibernateTemplate.find("from Book");
	}

	@Override
	public Book findBookByAuthor(String author) throws ResultNotFoundException {
		List<Book> books = (List<Book>)hibernateTemplate.find("from Book where author=?",author);
		if(books.size()==0){
			throw new ResultNotFoundException();
		}
		
		return books.get(0);
	}
}