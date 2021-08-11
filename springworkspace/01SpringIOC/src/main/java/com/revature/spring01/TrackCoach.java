package com.revature.spring01;

public class TrackCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run for 5kms";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		
		return fortune.getFortune();
	}
	
	private Fortune fortune;

//	public TrackCoach(Fortune fortune) {
//		super();
//		this.fortune = fortune;
//		System.out.println("Constructor called");
//	}
	
	public void myInitMethod() {
		System.out.println("My init method being called!");
	}
	public void myDestroyMethod() {
		System.out.println("My destroy method is called!");
	}
	
	public TrackCoach() {
		super();
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
		System.out.println("setter called!!");
	}
	

}
