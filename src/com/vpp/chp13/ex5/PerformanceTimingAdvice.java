package com.vpp.chp13.ex5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PerformanceTimingAdvice {
	
	@Pointcut("execution(java.util.List com.vpp.chp13.ex4.*Service.get*(..))")
	public void applyOnAllServiceMethodsWhichReturnsList(){
	}

	@Around("applyOnAllServiceMethodsWhichReturnsList()")
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
	
	@Before("applyOnAllServiceMethodsWhichReturnsList()")
	public void beforeAdviceTesting(JoinPoint jp){
		System.out.println("Before calling method "+jp.getSignature().getName());
	}
}