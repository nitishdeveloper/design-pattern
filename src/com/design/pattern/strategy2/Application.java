package com.design.pattern.strategy2;

public class Application {
	
	public static void main(String... args) {
	
	PaymentStrategyContext context = new PaymentStrategyContext();
	context.setPaymentStrategy(new PayUStrategy());
	context.paynow(PaymentMethod.CREDITCARD, 500);
	
	}
}
