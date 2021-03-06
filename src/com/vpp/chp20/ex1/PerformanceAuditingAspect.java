package com.vpp.chp20.ex1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PerformanceAuditingAspect {

	@Around("execution(* com.vpp.chp18.*.*(..))")
	public Object measurePerformance(ProceedingJoinPoint jp){
		long before = System.currentTimeMillis();
		
		try {
			return jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println((System.currentTimeMillis()-before)+" is passed in "+jp.getSignature().getName());
		}
		return null;
	}
}
