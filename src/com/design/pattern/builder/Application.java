package com.design.pattern.builder;


public class Application {

	public static void main(String[] args) {
		User user = new User.UserBuilder("Nitish","Prajapati")
				.moibile("9540095832")
				.address("faridabad")
				.build();
				
		System.out.println(user);	
		System.out.println("\n");
	     Address address = new Address.Builder()
	    		 		   .fullAddress("H NO - D/83 , Gali No - 4 , Palla No - 1")
	    		 		   .state("Haryana")
	    		 		   .city("Faridabad")
	    		 		   .pincode("121003")
	    		 		   .country("India")
	    		 		   .build();
	     System.out.println(address);
	     
	}

}
