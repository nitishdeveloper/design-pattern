package com.design.pattern.brige;

public class Application {

	public static void main(String[] args) {
		VehicleAbstraction vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		
		VehicleAbstraction vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
	}

}
