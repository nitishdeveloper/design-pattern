package com.design.pattern.state;



public class OutForDelivery implements OrderState{
	private static OutForDelivery forDelivery = new OutForDelivery();
	
	private OutForDelivery() {}

	public static OutForDelivery getInstance() {
		return forDelivery;
	}
	
	@Override
	public void updateOrderState(DeliveryContext context) {
		System.out.println("order is ready for delivered");
		context.setCurrentState(Delivered.getInstance());
	}
	
}
