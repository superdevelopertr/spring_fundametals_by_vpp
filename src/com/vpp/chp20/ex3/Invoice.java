package com.vpp.chp20.ex3;

public class Invoice {
	private int invoiceId;
	private String isbn;
	private String details;

	public Invoice(int invoiceId, String isbn,String details) {
		super();
		this.invoiceId = invoiceId;
		this.isbn = isbn;
		this.details = details;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	@Override
	public String toString() {
		return details+" for "+isbn;
	}
}
