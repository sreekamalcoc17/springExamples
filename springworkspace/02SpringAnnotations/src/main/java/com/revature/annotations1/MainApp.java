package com.revature.annotations1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		context.close();

	}

}
