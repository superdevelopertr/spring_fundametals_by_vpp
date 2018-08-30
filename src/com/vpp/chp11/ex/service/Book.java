package com.vpp.chp11.ex.service;

public class Book {
	private String name;
	private String isdn;
	private String author;
	private float price;

	public Book(String name, String isdn, String author, float price) {
		super();
		this.name = name;
		this.isdn = isdn;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getIsdn() {
		return isdn;
	}

	public String getAuthor() {
		return author;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + " by " + author;
	}
}