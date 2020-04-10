package com.design.pattern.state;

public class Delivered implements OrderState{

	private static Delivered delivered = new Delivered();
	
	private Delivered() {}

	public static Delivered getInstance() {
		return delivered;
	}
	
	@Override
	public void updateOrderState(DeliveryContext context) {
		System.out.println("Now order is in delivered state");		
	}

}
