package com.design.pattern.abstractfactory;

public abstract class Car {
	
	private CarType carType =  null;
	private Location location = null;
	
	public Car(CarType carType,Location location) {
		this.carType = carType;
		this.location = location;
	}
	
	protected abstract String construct();

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	
}
