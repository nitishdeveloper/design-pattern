package com.design.pattern.adapter2;

public class PhoneMemoryCard implements MemoryCardTarget{

	@Override
	public void insertCard() {
		System.out.println("CameraMemoryCard inserted now...!!!");
		
	}

}
