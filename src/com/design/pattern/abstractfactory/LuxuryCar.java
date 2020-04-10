package com.design.pattern.abstractfactory;

public class LuxuryCar extends Car{

	public LuxuryCar(CarType carType,Location location) {
		super(carType,location);
		construct();
	}
	
	@Override
	protected String construct() {
		 return "Model : "+super.getCarType() + " construct in "+super.getLocation();
	}


}
