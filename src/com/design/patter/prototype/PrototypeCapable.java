package com.design.patter.prototype;

public interface PrototypeCapable extends Cloneable {
	public PrototypeCapable clone() throws CloneNotSupportedException;
}
