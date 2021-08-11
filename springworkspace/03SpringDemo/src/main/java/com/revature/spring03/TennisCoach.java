package com.revature.spring03;


import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "play tennis for 3 hrs";
	}
	

}
