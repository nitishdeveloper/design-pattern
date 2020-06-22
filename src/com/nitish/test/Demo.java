package com.nitish.test;

import java.util.HashMap;
import java.util.Map;

class MyThreadA {
	int a;
}

 public class Demo {

	public static void main(String[] args) {
		String str = "1294221092973492394789793479273";
		System.out.println(freqency(str));
		
	}
	public static Map<Character , Integer> freqency(String str){
		Map<Character , Integer> map = new HashMap<Character, Integer>();
		
		if(str != null && !str.isEmpty()) {
			for (int i = 0; i < str.length()-1; i++) {
				 if(map.containsKey(str.charAt(i))) {
					 map.put(str.charAt(i), map.get(str.charAt(i))+1);
				 }else {
					 map.put(str.charAt(i), 1);
				 }
			}
			return map;
		}
		return map;
	}

}
