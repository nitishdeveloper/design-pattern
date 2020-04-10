package com.design.patter.prototype1;

public class Blue extends ColorPrototype{

	
	public  Blue() {
		this.colorName = "BLUE COLOR";
	}
	
	@Override
	public String addColor() {
		System.out.println("Blue color is added");
		return this.colorName;
	}
	
	
	
}
