package org.kls.learn.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@Before("execution(* get*())")
	public void LoggingAdvice() {
		System.out.println("Advice run, Get method called");
	}

	@Before("execution(* get*())")
	public void secondAdvice() {
		System.out.print("Second advice executed");
	}
}
