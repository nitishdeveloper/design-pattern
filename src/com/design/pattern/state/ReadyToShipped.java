package com.design.pattern.state;

public class ReadyToShipped implements OrderState{

	private static ReadyToShipped toShipped = new ReadyToShipped();
	
	
	
	private ReadyToShipped() {}

	public static ReadyToShipped getInstance() {
		return toShipped;
	}
	
	@Override
	public void updateOrderState(DeliveryContext context) {
		System.err.println("Now Order is in ready to ship state");
		context.setCurrentState(Shipped.getInstance());
	}

}
