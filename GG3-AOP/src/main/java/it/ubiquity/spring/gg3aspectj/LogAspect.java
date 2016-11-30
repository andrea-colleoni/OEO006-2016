package it.ubiquity.spring.gg3aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogAspect {

//	@After("execution(* it.ubiquity.spring.gg3aspectj.*lass*.*() ) ")
//	public void logBefore(JoinPoint jp) {
//		System.out.println("Prima del  metodo " + jp.getSignature().getName());
//	}
	
	@Around("execution(* it.ubiquity.spring..*lass*.*() ) ") 
	public void around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println(jp.getSignature().getName());
		if (System.currentTimeMillis() % 2 == 0) {
			jp.proceed();
		} else {
			System.out.println("Tu non pui passare di qui!!");
		}
	}
}
