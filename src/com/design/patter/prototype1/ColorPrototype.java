package com.design.patter.prototype1;

public abstract class ColorPrototype implements Cloneable{
	public String colorName;
	
	public abstract String addColor();
	
	public ColorPrototype colorClone() {
		
		ColorPrototype colorClone = null;
		try {
			colorClone = (ColorPrototype) super.clone();
		} catch (CloneNotSupportedException e) {
			 e.printStackTrace(); 
		}
		return colorClone;
	}
}
