package com.vpp.chp20.ex3;

import java.util.Currency;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class TestUID {

	public static void main(String[] args) {
		
		
		System.out.println(UUID.randomUUID().toString());
		
		java.util.Currency c = Currency.getInstance("UAH");
		
		System.out.println(c.getDisplayName());
		System.out.println(c.getCurrencyCode());
		
		
	}
}
