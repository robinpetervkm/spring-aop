package com.vattathara.spring.aop.springaop.aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//related to AOP
//Configuration
@Aspect//Aspect == PointCut+ADVICE
@Configuration
public class UserAccessAspect {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls i would like to intercept
	//execution(* PACKAGE.*.*(..))
	
	@Before("execution(* com.vattathara.spring.aop.springaop.data.*.*(..))")//PointCut
	
	//process of ensuring the right time call of execution statement is call WEAVING weaving
	
	// Process where whole thing is weaved around is called Weaving
	// framework is called Weaver
	public void before(JoinPoint joinPoint) {  //joinPoint -specific execution of method Instance
		LOGGER.info("Check for user access");							//ADVICE
		LOGGER.info("Allowing access for {}",joinPoint);
	}

}
