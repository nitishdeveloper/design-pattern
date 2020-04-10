package com.design.patter.prototype;

public class Movie implements PrototypeCapable{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie object..");
		return (Movie)super.clone();
	}

	@Override
	public String toString() {
		return "Movie";
	}
	
	
}
