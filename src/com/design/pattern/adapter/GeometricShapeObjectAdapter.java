package com.design.pattern.adapter;

public class GeometricShapeObjectAdapter implements TargetShape{

	
	GeometricShapeAdaptee geometricShapeAdaptee;
	

	public GeometricShapeObjectAdapter(GeometricShapeAdaptee geometricShapeAdaptee) {
		this.geometricShapeAdaptee = geometricShapeAdaptee;
	}

	@Override
	public void draw() {
		geometricShapeAdaptee.drawShape();
	}

	
	@Override
	public String description() {
		if(geometricShapeAdaptee instanceof Triangle) {
			return "Triangle  object is created now";
		}
		else {
			 return "Unknown object";	
		}
	}


}
