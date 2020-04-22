package com.design.pattern.facade;

public class Iphone implements MobileStore{

	@Override
	public void model() {
		System.out.println("Iphone 12");
	}

	@Override
	public void price() {
		System.out.println("price : 750000 INR");
	}


}
