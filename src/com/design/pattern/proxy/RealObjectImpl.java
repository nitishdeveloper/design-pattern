package com.design.pattern.proxy;

public class RealObjectImpl implements RealObject {

	@Override
	public void execute() {
		System.out.println("request real object in impl");
	}

}
