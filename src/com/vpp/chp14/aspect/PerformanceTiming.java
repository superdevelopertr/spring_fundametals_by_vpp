package com.vpp.chp14.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceTiming {

	public Object calcTime(ProceedingJoinPoint jp) throws Throwable{
		long before = System.currentTimeMillis();
		Object result = jp.proceed();
		System.out.println("Time "+(System.currentTimeMillis()-before)+" is elapsed for "+jp.getSignature().getName());
		return result;
	}
	
}