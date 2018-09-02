package com.vpp.chp13.ex2.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HelloAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After the method "+method.getName());
		System.out.println("Return value is "+returnValue);
	}

}