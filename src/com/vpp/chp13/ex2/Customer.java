package com.vpp.chp13.ex2;

import java.util.ArrayList;
import java.util.List;


public class Customer 
{

	private String customerId;
	
	private String customerName;
	
	/**
	 * The company name
	 */
	private String companyName;
	
	/**
	 * The contact's email address
	 */
	private String email;
	
	/**
	 * The contact's telephone number
	 */
	private String telephone;
	
	/**
	 * Any notes associated with this customer
	 */
	private String notes;
	
	/**
	 * References to any Calls this customer has made
	 */
	private List<Call> calls;	
	
	/**
	 * Constructor - id, notes and name are required
	 */
	public Customer(String customerId, String customerName, String companyName, String email,
			        String telephone, String notes)
	{
		this(customerId, customerName, companyName, notes);
		this.email = email;
		this.telephone = telephone;
	}
	
	/**
	 * Constructor - email and telephone are optional
	 */
	public Customer(String customerId, String customerName, String companyName, String notes)
	{
		this.customerId = customerId;
		this.customerName= customerName;
		this.companyName = companyName;
		this.notes = notes;
		this.calls = new ArrayList<Call>();
	}
	
	/**
	 * Add a new call for this customer
	 */
	public void addCall(Call callDetails) 
	{
		this.calls.add(callDetails);		
	}
	
	/**
	 * A Simple toString implementation
	 */
	public String toString()
	{
		return this.customerId + ": " + this.companyName ;
	}

	public String getCustomerId() 
	{
		return this.customerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getNotes() {
		return notes;
	}

	public List<Call> getCalls() {
		return calls;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public void setCalls(List<Call> calls) {
		this.calls = calls;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	// needed for JPA - ignore until then
	public Customer() {}
}
