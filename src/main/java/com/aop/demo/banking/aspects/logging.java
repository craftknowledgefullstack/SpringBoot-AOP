package com.aop.demo.banking.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class logging {

	@Pointcut("execution( * com.aop.demo.banking.transactionDetails.TransactionInfo(..))")
	
	public void loggingpointcut() {}
	
	
	
	@AfterReturning( pointcut = "loggingpointcut()" , returning = "data" )
	
	public void loggingINfo( JoinPoint joinPoint,  int data ) {
		
		System.out.println(joinPoint.getSignature());
		
		System.out.println("logging info" +"-> "+ data);
		
	}
	
}
