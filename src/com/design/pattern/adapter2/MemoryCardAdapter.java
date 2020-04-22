package com.design.pattern.adapter2;

public class MemoryCardAdapter implements MemoryCardTarget{
	LaptopAdaptee adaptee;

	public MemoryCardAdapter(LaptopAdaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	
	@Override
	public void insertCard() {
		adaptee.accepted();
	}
}
