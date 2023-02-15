package com.aop.demo.banking.aspects;

import java.util.Scanner;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class OAuth2 {

	
	@Pointcut("execution( * com.aop.demo.banking.transactionDetails.TransactionInfo(..))")
	public void securitypointcut() {}
	
	
	@Before("securitypointcut()")
	public void securityFilter() {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your username");
		
		scanner.next();
		
       System.out.println("Enter your password");
		
		scanner.next();
		
		System.out.println("User is Auth");
	}
	
}
