package com.design.pattern.strategy;

public class LinkedinStrategy implements ISocialMediaStrategy{

	@Override
	public void connectTo(String friendName) {
		System.out.println("Connecting with " + friendName + " through Linkedin");
		
	}

}
