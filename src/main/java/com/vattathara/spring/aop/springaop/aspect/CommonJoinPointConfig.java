package com.vattathara.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.vattathara.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	@Pointcut("execution(* com.vattathara.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	

}
