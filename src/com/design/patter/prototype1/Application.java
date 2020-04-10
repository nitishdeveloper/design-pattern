package com.design.patter.prototype1;

import com.design.patter.prototype1.PrototypeFactory.ColorType;

public class Application {

	public static void main(String[] args) {
		System.out.println(PrototypeFactory.getColor(ColorType.RED).addColor());
		System.out.println(PrototypeFactory.getColor(ColorType.BLUE).addColor());
		System.out.println(PrototypeFactory.getColor(ColorType.GREEN).addColor());
	}

}
