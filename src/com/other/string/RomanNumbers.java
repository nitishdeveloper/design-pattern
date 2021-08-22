package com.other.string;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {

	public static void main(String[] args) {
		System.out.println(romanToInt("XXXVI"));
	}
	
	 public static int romanToInt(String s) {
	        Map<Character, Integer> map = new HashMap<Character, Integer>();
	            map.put('I' ,1);
	            map.put('V' ,5);
	            map.put('X' ,10);
	            map.put('L' ,50);
	            map.put('C' ,100);
	            map.put('D' ,500);
	            map.put('M' ,1000);
	            map.put('G' ,5000);
	            map.put('H' ,10000);
	      
	            int sum = 0;
	            int start = map.get(s.charAt(0));
	            int current = 0;
	          
	            for(int i = 1; i < s.length(); i++){
	                 current = map.get(s.charAt(i));
	                 
	                  if(start < current){
	                     sum = sum - start;
	                  }else{
	                      sum = sum + start;
	                  }
	              start = current;
	            }
	          sum = sum + start;
	          return sum;
	    }
	 
	 public static String integerToRoman(int num){
			if (num < 1 || num > 3999) return "";
			
			StringBuilder result = new StringBuilder();
			
			String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
			int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
			
			int i = 0;
			while (num > 0) {
				while ( num >= values[i]) {
					num = num - values[i];
					result.append(roman[i]);
				}
				i++;
			}
			return result.toString();
		}


}
