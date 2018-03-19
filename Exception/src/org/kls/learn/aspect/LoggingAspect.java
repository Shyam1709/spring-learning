package org.kls.learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.kls.learn.model.Circle;

@Aspect
public class LoggingAspect {
	@Before("allGetters()")
	public void LoggingAdvice(JoinPoint joinpoint) {
		// System.out.println(joinpoint.toString());
		//System.out.println(joinpoint.getTarget());

	}

	@AfterReturning("args(name)")
	public void stringArgumentMethods(String name){
		System.out.println("Method that take spring argument has been called. Value is" + name);
	}
	
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name){
		System.out.println("Exception has been thrown");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {

	}

	@Pointcut("within(org.kls.learn.model.Circle)")
	public void allCircleMethods() {
	}

}
