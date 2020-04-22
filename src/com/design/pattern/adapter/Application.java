package com.design.pattern.adapter;

public class Application {

	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.addShape(new Circle());
		drawing.addShape(new Ractangle());
		drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
		drawing.draw();
	}

}
