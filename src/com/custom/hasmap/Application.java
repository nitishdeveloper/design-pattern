package com.custom.hasmap;

public class Application {

	public static void main(String[] args) {
		CustomHashMap<String , Integer> hashMap = new CustomHashMap<String , Integer>();
		hashMap.put("Ram", 50);
		hashMap.put("Laxam", 40);
		hashMap.put("Bharat", 45);
		hashMap.put("Shatrudhan", 35);
		hashMap.put("Ram", 55);
		
		hashMap.display();
		
		
		CustomHashMap<Integer , Integer> hashMap1 = new CustomHashMap<Integer , Integer>();
		hashMap1.put(21, 12);
		hashMap1.put(25, 121);
		hashMap1.put(30, 151);
		hashMap1.put(33, 15);
		hashMap1.put(35, 89);
		
		hashMap1.display();
	}

}
