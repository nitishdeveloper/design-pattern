package com.design.patter.prototype1;

public class Red extends ColorPrototype{

	
	public Red() {
		this.colorName = "RED COLOR";
	}
	
	@Override
	public String addColor() {
		System.out.println("Red color added"); 
		return this.colorName;
	}

}
