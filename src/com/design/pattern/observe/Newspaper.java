package com.design.pattern.observe;

public class Newspaper implements Observe{

	@Override
	public void update(float interest) {
		System.out.println("Newspaper: Interest Rate updated, new Rate is: "+ interest);		
	}

}
