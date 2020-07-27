package com.vattathara.spring.aop.springaop.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
@Aspect

@Configuration

public class AfterAopAspect {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = 
			"execution(* com.vattathara.spring.aop.springaop.business.*.*(..))",
			returning = "result"
			) // PointCut

	public void afterReturning(JoinPoint joinPoint,Object result) {
		LOGGER.info("{} returned with value {}", joinPoint,result);
	}
	@After("execution(* com.vattathara.spring.aop.springaop.business.*.*(..))")
	
	public void after(JoinPoint joinPoint) {
		LOGGER.info("after executing {}", joinPoint);
	}
	@AfterThrowing(value = 
			"execution(* com.vattathara.spring.aop.springaop.business.*.*(..))",
			throwing = "exception"
			) // PointCut
	
	public void afterThrowing(JoinPoint joinPoint,Exception exception) {
		LOGGER.info("{} throw exception {}", joinPoint,exception);
	}

}
