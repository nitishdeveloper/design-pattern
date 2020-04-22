package com.design.pattern.proxy;

public class Application {

	public static void main(String[] args) {
		RealObject object = new RealObjectProxy();
		object.execute();
	}

}
