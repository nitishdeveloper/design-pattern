package com.design.patter.prototype1;

public class Green extends ColorPrototype{

	public  Green() {
		this.colorName = "GREEN COLOR";
	}
	
	@Override
	public String addColor() {
		System.out.println("Blue color is added");
		return this.colorName;
	}

}
