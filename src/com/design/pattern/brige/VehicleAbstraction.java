package com.design.pattern.brige;

public abstract class VehicleAbstraction {
	public WorkshopImplemention workshop1;
	public WorkshopImplemention workshop2;
	
	public VehicleAbstraction(WorkshopImplemention workshop1, WorkshopImplemention workshop2) {
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
	}
	
	public abstract void manufacture(); 
	
}
