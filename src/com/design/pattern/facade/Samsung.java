package com.design.pattern.facade;

public class Samsung implements MobileStore{

	@Override
	public void model() {
		System.out.println("Sumsung M20");
	}

	@Override
	public void price() {
		System.out.println("price : 50000 INR");
	}

}
