package com.design.patter.prototype;

public class Album implements PrototypeCapable{

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Album clone() throws CloneNotSupportedException{
		System.out.println("Cloning Album object..");
		return (Album)super.clone();
	}
	
	@Override
	public String toString() {
		return "Album";
	}
}
