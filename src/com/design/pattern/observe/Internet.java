package com.design.pattern.observe;

public class Internet implements Observe{

	@Override
	public void update(float interest) {
		System.out.println("Internet: Interest Rate updated, new Rate is: "+ interest);
	}

}
