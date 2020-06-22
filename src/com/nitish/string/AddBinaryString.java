package com.nitish.string;

import java.util.HashMap;
import java.util.Map;

public class AddBinaryString {

	public static void main(String[] args) {
//		addStringsss("11","11");
		System.out.println(isAnagramUsingHashMap("anagram","nagaram"));

	}
	public static void addBinary(String a , String b) {
		
		int aString = a.length();
		int bString = b.length();
		int carry = 0;
		int count = 0;
		int sum = 0;
		StringBuilder result = new  StringBuilder();
		
		while(count < aString || count < bString || carry != 0) {
			int num1 = 0;
			int num2 = 0;
			 if(count < aString) {
				  num1 = Character.getNumericValue(a.charAt(aString-1-count));
			 }else {
				 num1 = 0;
			 }
			 if(count < bString) {
				  num2 = Character.getNumericValue(b.charAt(bString-1-count));
			 }else {
				 num2 = 0;
			 }
			 sum = (num1 +  num2 + carry);
			 result = result.append(sum%2);
			 carry = sum / 2;
			
			 count++;
		}
		System.out.println("sum : "+result.reverse().toString());
	}
	
	static void addBinary2(String a, String b) 
    {  
		 char p = '2';
		 char q = '9';
		 System.out.println(p);
		 int val = p + q;
          System.out.println(val);
        String result = "";  
        int s = 0;          
  
        int i = a.length() - 1, j = b.length() - 1; 
        while (i >= 0 || j >= 0 || s == 1) 
        { 
          
        	if(i >= 0){
        		s += a.charAt(i) - '0';
        	}else {
        		s += 0;
        	}
        	if(j >= 0){
        		s += a.charAt(j) - '0';
        	}else {
        		s += 0;
        	}
//            s += ((i >= 0)? a.charAt(i) - '0': 0); 
//            s += ((j >= 0)? b.charAt(j) - '0': 0); 
            result = (char)(s % 2 + '0') + result; 
            s = s / 2; 
  
            i--; j--; 
        } 
          
        System.out.println("sum : "+result);
    } 
	
	  public static String addStringsss(String num1, String num2) {
		    int alen = num1.length()-1;
	        int blen = num2.length()-1;
	        int carry = 0 , sum = 0;
	        StringBuilder result = new StringBuilder();
	        
	        while(alen >= 0 || blen >=0 || carry != 0){
	             int val1 = (alen >= 0) ? num1.charAt(alen) - '0' : 0;
	             int val2 = (blen >= 0) ? num2.charAt(blen) - '0' : 0; 
	             sum = val1 + val2 + carry;
	             result.append(sum % 10);
	             carry = sum / 10;
             alen--;
             blen--;
	        }
	      return result.reverse().toString();
	    }
	  
	  //anagram
	  public static boolean isAnagramTrueOrFalse(String str1 , String str2){
	       if(str1.length() != str2.length()) return false;
	       
	        int[] bucket = new int[26];
	        char a = 'a';
	       for(int i = 0; i < str1.length() ; i++){
	    	   System.out.println(str1.charAt(i)+" - "+ a +" = "+ (str1.charAt(i) - a));
	           bucket[ str1.charAt(i) - 'a' ]++;
	           bucket[ str2.charAt(i) - 'a']--;
	       }
	       
	       for(int count : bucket){
	           if(count != 0){
	             return false;
	           }
	       }
	      return true;
	    } 
	  
	  public static boolean isAnagramUsingHashMap(String str1 , String str2){
	       if(str1.length() != str2.length()) return false;
	       
	       HashMap<Character, Integer> map1 = new HashMap<Character, Integer>(); 
	       HashMap<Character, Integer> map2 = new HashMap<Character, Integer>(); 
	        char[]  ch = str1.toCharArray();
	        char[]  ch1 = str2.toCharArray();
	        
	        for (int i = 0; i < ch.length; i++) {
				 if(map1.get(ch[i]) == null) {
					 map1.put(ch[i], 1);
				 }else {
					    Integer count = map1.get(ch[i]);
					    map1.put(ch[i], count++);
				 }
			}
	        for (int i = 0; i < ch1.length; i++) {
				 if(map2.get(ch1[i]) == null) {
					 map2.put(ch1[i], 1);
				 }else {
					    Integer count = map2.get(ch1[i]);
					    map1.put(ch1[i], count++);
				 }
			}
	        if(map1.equals(map2)) {
	        	return true;
	        }
	         
	      return false;
	    }
}
