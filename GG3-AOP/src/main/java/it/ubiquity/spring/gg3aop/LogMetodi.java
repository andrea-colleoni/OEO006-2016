package it.ubiquity.spring.gg3aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogMetodi implements MethodBeforeAdvice {

	public void before(Method metodo, Object[] argomentiMetodo, Object oggettoTarget) throws Throwable {
		System.out.println("Sto per entrare nel metodo " + metodo.getName());
		
	}

	
}
