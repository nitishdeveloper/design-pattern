package com.design.pattern.strategy2;

public interface PaymentStrategy {
	public void payment(PaymentMethod paymentMethod,int amount);
}
