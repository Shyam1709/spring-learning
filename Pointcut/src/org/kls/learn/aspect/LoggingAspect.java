package org.kls.learn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.kls.learn.model.Circle;

@Aspect
public class LoggingAspect {
	@Before("allGetters()")
	public void LoggingAdvice(JoinPoint joinpoint) {
		// System.out.println(joinpoint.toString());
		System.out.println(joinpoint.getTarget());

	}

	@Before("args(name)")
	public void stringArgumentMethods(String name){
		System.out.println("Method that take spring argument has been called. Value is" + name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {

	}

	@Pointcut("within(org.kls.learn.model.Circle)")
	public void allCircleMethods() {
	}

}
