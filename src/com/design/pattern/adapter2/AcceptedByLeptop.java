package com.design.pattern.adapter2;

public class AcceptedByLeptop implements LaptopAdaptee{

	@Override
	public void accepted() {
		System.out.println("memory card is accepted ");
		copyFile();
	}

	@Override
	public void copyFile() {
		System.out.println("file is going to copy now....!!!");
		
	}

}
