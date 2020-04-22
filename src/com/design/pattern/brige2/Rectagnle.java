package com.design.pattern.brige2;

public class Rectagnle implements ShapeAbstraction{

	ColorImplementor color;
	
	
	public Rectagnle(ColorImplementor color) {
		this.color = color;
	}


	@Override
	public void add(String colorName) {
		System.out.println(color.fillColor(colorName));
	}

}
