package com.design.pattern.strategy2;

public class PayUStrategy implements PaymentStrategy{

	@Override
	public void payment(PaymentMethod paymentMethod,int amount) {
		System.out.println(amount +" paid with using "+paymentMethod);
	}

}
