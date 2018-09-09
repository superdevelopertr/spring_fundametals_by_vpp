package com.vpp.chp02.v2;

import java.time.LocalDate;

public class Invoice {

	private int invoiceId;
	private LocalDate date;
	private String fullName;

	public Invoice(int invoiceId, LocalDate date, String fullName) {
		super();
		this.invoiceId = invoiceId;
		this.date = date;
		this.fullName = fullName;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", date=" + date + ", fullName=" + fullName + "]";
	}
}