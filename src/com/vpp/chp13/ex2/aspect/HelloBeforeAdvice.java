package com.vpp.chp13.ex2.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HelloBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Before the method "+method.getName());
	}

}