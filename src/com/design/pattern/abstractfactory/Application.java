package com.design.pattern.abstractfactory;

public class Application {

	public static void main(String[] args) {
		System.out.println(CarFactory.constructCar(CarType.LUXURY,Location.USA).construct());
	}

}
 