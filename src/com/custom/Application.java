package com.custom;

import com.custom.hashmap.MyHashMap;
import com.custom.map.MyMap;

public class Application {

	public static void main(String[] args) {
		MyMap<String, Integer> hashMap = new MyHashMap<>();

		hashMap.put("Aman", 50);
		hashMap.put("Sunny", 40);
		hashMap.put("Bharat", 45);
		hashMap.put("Sunny", 40);
		hashMap.put("Shatrudhan", 35);
		hashMap.put("Ram", 55);
//		hashMap.put(null, 55);
		hashMap.put("Aman", 90);

		hashMap.print();

		System.out.println(hashMap.get("Bharat"));

//
//		CustomHashMap<Integer , Integer> hashMap1 = new CustomHashMap<Integer , Integer>();
//		hashMap1.put(21, 12);
//		hashMap1.put(25, 121);
//		hashMap1.put(30, 151);
//		hashMap1.put(33, 15);
//		hashMap1.put(35, 89);
	}

}
