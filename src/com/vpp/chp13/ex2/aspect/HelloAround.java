package com.vpp.chp13.ex2.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HelloAround implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		long before = System.currentTimeMillis();
		Object result =invocation.proceed();
		long after = System.currentTimeMillis();
		
		System.out.println("The Method "+invocation.getMethod().getName()+" tooks "+(after-before));
		return result;
	}

}
