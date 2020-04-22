package com.design.pattern.brige;

public class Car extends VehicleAbstraction{

	public Car(WorkshopImplemention workshop1, WorkshopImplemention workshop2) {
		super(workshop1, workshop2);
		
	}

	@Override
	public void manufacture() {
		System.out.println("car manufacture");
	}

}
