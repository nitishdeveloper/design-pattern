package com.design.pattern.state;

public class Shipped implements OrderState  {

	private static Shipped shipped = new Shipped();
	
	public static Shipped getInstance() {
		return shipped;
	}
	
	@Override
	public void updateOrderState(DeliveryContext context) {
		System.out.println("order is in shipped state");
		context.setCurrentState(OutForDelivery.getInstance());
	}

}
