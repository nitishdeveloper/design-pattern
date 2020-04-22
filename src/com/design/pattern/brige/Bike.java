package com.design.pattern.brige;

public class Bike extends VehicleAbstraction{

	public Bike(WorkshopImplemention workshop1, WorkshopImplemention workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.println("bike manufacture");
	}

}
