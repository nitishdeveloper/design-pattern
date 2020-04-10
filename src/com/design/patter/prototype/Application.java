package com.design.patter.prototype;

import com.design.patter.prototype.PrototypeFactory.ModelType;

public class Application {

	public static void main(String... args) {
		String prototype;
		try {
			prototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
			System.out.println(prototype);
			
			prototype =  PrototypeFactory.getInstance(ModelType.ALBUM).toString(); 
			System.out.println(prototype);
			
			prototype =  PrototypeFactory.getInstance(ModelType.SHOW).toString(); 
			System.out.println(prototype);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
				
	}

}
