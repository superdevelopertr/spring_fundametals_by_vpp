package com.vpp.chp3.ex2.domain;

import java.math.BigDecimal;

public class Book {
	private String name;
	private String isbn;
	private String author;
	private BigDecimal price;
	public Book(String name, String isbn, String author, BigDecimal price) {
		super();
		this.name=name;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	
	@Override
	public String toString() {
		return name+" by "+author;
	}
}
