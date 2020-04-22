package com.design.pattern.brige2;

public class Application {

	public static void main(String[] args) {
		ShapeAbstraction circle = new Circle(new Red());
		circle.add("red");

		ShapeAbstraction blue = new Circle(new Blue());
		blue.add("blue");
	}

}
