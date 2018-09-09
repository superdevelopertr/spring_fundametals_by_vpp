package com.vpp.chp13.ex6.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceTimingAdvice {

	public Object timeMesarument(ProceedingJoinPoint invocation) throws Throwable {

		long before = System.currentTimeMillis();
		Object result =invocation.proceed();
		long after = System.currentTimeMillis();
		
		System.out.println("The Method "+invocation.getSignature().getName()+" tooks "+(after-before));
		return result;
	}
	
	public void logMethodStart(JoinPoint jp){
		System.out.println("Before method "+jp.getSignature().getName());
	}
}