package com.vpp.chp13.ex3;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceTimingAdvice {

	public Object timeMesarument(ProceedingJoinPoint invocation) throws Throwable {

		long before = System.currentTimeMillis();
		Object result =invocation.proceed();
		long after = System.currentTimeMillis();
		
		System.out.println("The Method "+invocation.getSignature().getName()+" tooks "+(after-before));
		return result;
	}
}