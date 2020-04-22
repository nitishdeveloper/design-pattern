package com.design.pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

	List<TargetShape> shapes = new ArrayList<>();

	public Drawing() {
		super();
	} 
	
	public void addShape(TargetShape shape) {
		shapes.add(shape);
	}
	
	public List<TargetShape> getShapes(){
		return new ArrayList<TargetShape>();
		}
	
	public void draw() {
		if(shapes.isEmpty()) {
			System.out.println("nothing can draw...!!!");
		}
		else {
			shapes.stream().forEach(
					shape -> shape.draw()
					);
		}
	}
	
}
