package com.vpp.chp02;

import java.time.LocalDate;

//all new operator used places make tightly coupling
public class ExampleOfCoupling {

	//it still make coupling. But it is a system class. It will not be changed.
	//in case we change type, it means program changed we need to re-test it is normal.
	private String x = "Hello world!";
	
	
	//tighly coupling
	private Invoice invoice = new Invoice(1, LocalDate.now(), "Abdullah Ilhanli");
	
	//tighly coupling
	public ExampleOfCoupling() {
		Invoice invoice = new Invoice(1, LocalDate.now(), "Abdullah Ilhanli");
	}	
}
