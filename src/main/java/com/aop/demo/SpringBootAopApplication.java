package com.aop.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.aop.demo.banking.transactionDetails;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  applicationContext=	SpringApplication.run(SpringBootAopApplication.class, args);
 
		transactionDetails details= applicationContext.getBean(transactionDetails.class);
		
		details.TransactionInfo( 23,4 );
	
	}

}
