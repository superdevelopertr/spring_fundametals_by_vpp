package com.vpp.chp13.ex4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceTimingAdvice {

	public Object measurePerformance(ProceedingJoinPoint jp){
		long before = System.currentTimeMillis();
		
		try {
			Object result =jp.proceed();
			return result;
		} catch (Throwable e) {
			e.printStackTrace();
		}finally{
			long after  = System.currentTimeMillis();
			System.out.println("total time is "+(after-before));
			System.out.println("now in method "+jp.getSignature().getName());
		}
		return null;
	}
	
	public void beforeAdviceTesting(JoinPoint jp){
		System.out.println("Before calling method "+jp.getSignature().getName());
	}
}