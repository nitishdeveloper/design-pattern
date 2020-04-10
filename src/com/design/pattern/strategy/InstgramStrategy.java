package com.design.pattern.strategy;

public class InstgramStrategy implements ISocialMediaStrategy{

	@Override
	public void connectTo(String friendName) {
		System.out.println("Connecting with " + friendName + " through Instagram");
		
	}

}
