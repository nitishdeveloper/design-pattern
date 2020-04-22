package com.design.pattern.brige2;

public class Circle implements ShapeAbstraction{
	
	ColorImplementor color;
	

	public Circle(ColorImplementor color) {
		this.color = color;
	}

	@Override
	public void add(String colorName) {
		System.out.println(color.fillColor(colorName));
	}

}
