package com.design.pattern.state;

public class Processing implements OrderState{
	private static Processing processing = new Processing();
		
	private Processing() {}

	public static Processing getInstance() {
		return processing;
	}
	
	@Override
	public void updateOrderState(DeliveryContext context) {
		System.err.println("Now Order is in processing state");
		context.setCurrentState(ReadyToShipped.getInstance());
	}
	
}
