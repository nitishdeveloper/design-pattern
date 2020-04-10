package com.design.pattern.abstractfactory;

public class CarFactory {
	public static Car constructCar(CarType carType, Location location) {
		Car car = null;
		switch (location) {
		case USA:
			car = new USACarFactory().contructUSACar(carType,location);
			break;
		case ASIA:
			car = new AsiaCarFactory().contructAisaCar(carType,location);
			break;
		default:
			System.out.println("location not found...!!!");
			break;
		}
		return car;
	}
}
