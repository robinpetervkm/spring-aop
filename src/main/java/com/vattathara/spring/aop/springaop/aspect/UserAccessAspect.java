package com.vattathara.spring.aop.springaop.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//related to AOP
//Configuration
@Aspect
@Configuration
public class UserAccessAspect {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls i would like to intercept
	//execution(* PACKAGE.*.*(..))
	
	@Before("execution(* com.vattathara.spring.aop.springaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		LOGGER.info("Check for user access");
		LOGGER.info("Allowing access for {}",joinPoint);
	}

}
