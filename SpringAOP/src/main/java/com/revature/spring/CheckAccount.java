package com.revature.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CheckAccount {
	
	@Before("execution(public void addAccount())")
	public void checkAddAccount() {
		System.out.println("checking the documents");
	}
	
	@After("execution(public void addAccount())")
	public void accountAdded() {
		System.out.println("Account added to the system ");
	}

}
