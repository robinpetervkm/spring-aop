package com.vattathara.spring.aop.springaop.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect

@Configuration
public class MethodExecutionCalculationAspect {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Around("com.vattathara.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()") // PointCut
	public void around(ProceedingJoinPoint pJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		pJoinPoint.proceed();
		long timeTaken = System.currentTimeMillis()-startTime;
		LOGGER.info("Time Taken By {} is {}", pJoinPoint,timeTaken);
	}
}
