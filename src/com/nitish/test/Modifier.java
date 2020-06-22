package com.nitish.test;

class Animal {
	 
	protected void move() {
        System.out.println("move");
    }
}


 class Dog extends Animal {
	 protected void move() {
		 super.move();   // Animal movement
		 System.out.println("movies");
	  }
}


public class Modifier {

	public static void main(String[] args) {
		try{
				System.out.println("Executing try block"); 
		  }
		  finally{
			  	System.out.println("Executing finally block"); 
		  }
	}

}
