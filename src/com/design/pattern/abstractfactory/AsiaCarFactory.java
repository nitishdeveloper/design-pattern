package com.design.pattern.abstractfactory;

public class AsiaCarFactory {
	public Car contructAisaCar(CarType carType,Location location) {
		Car car = null;
		switch(carType) {
		case SMALL :	
				car = new SmallCar(carType, location);
				break;
		case SEDAN:
				car = new SedanCar(carType, location);
				break;
		case LUXURY :	
				car = new LuxuryCar(carType, location);
			 	break;
		default :
			System.out.println("car type not found...!!!");
				
		}
		return car;
	}
}
