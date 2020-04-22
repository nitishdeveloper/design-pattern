package com.design.pattern.adapter;

public class Triangle implements GeometricShapeAdaptee{

	
	private final double a;
    private final double b;
    private final double c;
    
	public Triangle() {
		this(1.6d,2.5d,3.5d);
	}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}



	@Override
	public double area() {
		double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	@Override
	public void drawShape() {
	    System.out.println("Triangle Area: " + area());		
	}

}
