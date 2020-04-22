package com.design.pattern.brige2;

public class SbiGateway implements PaymentGateway{

	@Override
	public void gateway(String name) {
		System.out.println(name);
	}

}
