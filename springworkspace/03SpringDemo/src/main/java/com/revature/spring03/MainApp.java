package com.revature.spring03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsCOnfig.class);
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		context.close();

	}

}
