package com.design.pattern.facade;

public class Nokia implements MobileStore{

	@Override
	public void model() {
		System.out.println("Nokia A162");
	}

	@Override
	public void price() {
		System.out.println("price : 15000 INR");
	}

}
