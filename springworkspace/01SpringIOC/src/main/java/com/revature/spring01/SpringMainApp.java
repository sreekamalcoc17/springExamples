package com.revature.spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Coach mycoach = context.getBean("mycoach",Coach.class);
		System.out.println(mycoach.getDailyWorkout());
		System.out.println(mycoach.getDailyFortune());
		context.close();
		
	}

}
