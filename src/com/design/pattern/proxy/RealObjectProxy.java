package com.design.pattern.proxy;

public class RealObjectProxy extends RealObjectImpl {
	
	@Override
	public void execute() {
		System.out.println("I am in RealObjectProxy...!!!");
		super.execute();
	}
}
