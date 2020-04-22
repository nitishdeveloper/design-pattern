package com.design.pattern.brige2;

public class Red implements ColorImplementor{

	@Override
	public String fillColor(String colorname) {
		return colorname;
	}

}
