package com.design.pattern.adapter;

public class Ractangle implements TargetShape {

	@Override
	public void draw() {
		System.out.println("drawing Ractangle");
	}

	@Override
	public String description() {
		return "discription Ractangle";
	}

}
