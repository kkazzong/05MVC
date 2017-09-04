package com.model2.mvc.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspectJ {

	public LogAspectJ() {
		System.out.println("@"+getClass()+"@");
	}
	
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
		
		System.out.println("\n[AroundBefore] "+getClass()+" invoke() ���� ");
		System.out.println("[AroundBefore] target object :::::: \n"+joinPoint.getTarget());
		System.out.println("[AroundBefore] target method ::::::\n"+joinPoint.getSignature());
		
		if(joinPoint.getArgs().length != 0) {
			System.out.println("[AroundBefore] target object�� method�� ���޵� ���� :");
			System.out.println(joinPoint.getArgs()[0]);
		}
		
		Object obj = joinPoint.proceed();
		
		System.out.println("[AroundAfter] target object return value >> "+obj);
		System.out.println("[AroundAfter] "+getClass()+" invoke() �� ");
		return obj;
	}
}
