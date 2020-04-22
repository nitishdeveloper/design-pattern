package com.design.pattern.brige;

public class Assemble implements WorkshopImplemention{

	@Override
	public void work() {
		System.out.print(" And"); 
        System.out.println(" Assembled."); 		
	}

}
