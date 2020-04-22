package com.design.pattern.adapter;

public class Circle implements TargetShape {

	@Override
	public void draw() {
		System.out.println("drawing circle");
	}

	@Override
	public String description() {
		return "discription circle";
	}

}
