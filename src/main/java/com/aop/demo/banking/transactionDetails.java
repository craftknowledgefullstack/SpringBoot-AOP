package com.aop.demo.banking;

import org.springframework.stereotype.Component;

import com.aop.demo.banking.aspects.OAuth2;


@Component
public class transactionDetails {

	
	
	
	public int  TransactionInfo( int price, int qnt ) {
		
		System.out.println("Transaction info here price * qnt ");
	
	return price*qnt ;
	}
	
	
}
