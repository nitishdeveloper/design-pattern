package com.design.pattern.state;

public class Application {

	public static void main(String[] args) {
		DeliveryContext deliveryContext = new DeliveryContext(null,"order placed");
				
		deliveryContext.update();
		deliveryContext.update();
		deliveryContext.update();
		deliveryContext.update();
		deliveryContext.update();
	}

}
