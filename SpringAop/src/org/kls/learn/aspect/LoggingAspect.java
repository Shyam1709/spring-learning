package org.kls.learn.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
@Before("execution(public String getName())")
	public void LoggingAdvice() {
		System.out.print("Advice run, Get method called");
	}
}
