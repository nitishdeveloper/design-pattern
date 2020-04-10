package com.design.pattern.strategy2;

public class PaymentStrategyContext {
	private static PaymentStrategy paymentStrategy;

	public  void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		PaymentStrategyContext.paymentStrategy = paymentStrategy;
	}
	
	public void paynow(PaymentMethod paymentMethod,int amount) {
		paymentStrategy.payment(paymentMethod, amount);
	}
	
}
