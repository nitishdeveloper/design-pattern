package com.design.pattern.brige2;

public class HdfcGateway implements PaymentGateway{

	@Override
	public void gateway(String name) {
		System.out.println(name);
		}

}
