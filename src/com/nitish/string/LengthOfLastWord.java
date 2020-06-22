package com.nitish.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str = " ";
//		System.out.println(lengthOfLastWord(str));
		
		System.out.println(isAnagramTrueOrFalse("abc" ,"cab"));
	}
	
	public static int lengthOfLastWord(String s) {
        if(s == null || s.trim().isEmpty()) return 0;
        String[] str = s.split(" ");
      return str[str.length-1].length();
    }
    
	
	public static boolean buddyStrings(String A, String B) {
        if(A == null && B == null) return false;

        if(A.length() != B.length()) {
        	return false;
        }
        
        Set<Character> set = new HashSet<Character>();
        
        if(A.equals(B)) {
        	for(Character ch : A.toCharArray()) {
        		set.add(ch);
        	}
        	if(set.size() == A.length()) {
        		return true;
        	}else {
        		return false;
        	}
        }
        	
       List<Integer> list = new ArrayList<Integer>();
       for (int i = 0; i < A.length(); i++) {
    	   if(A.charAt(i) != B.charAt(i)) {
    		   list.add(i);
    	   }
       }
       if(list.size() == 2 && A.charAt(0) == B.charAt(1) && A.charAt(1) == B.charAt(0)) {
    	   return true;
       }
    
       return false;
       
    }
	
	public static boolean buddyStrings1(String A, String B) {
		int[] AFreq = new int[26]; 
	     int[] BFreq = new int[26]; 
	     int count = 0;
	     
	     for(int i = 0 ; i < A.length(); i++){
	         if(A.charAt(i) != B.charAt(i)){
	           count++;
	         }
	         AFreq[A.charAt(i) - 'a']++;
	         BFreq[B.charAt(i) - 'a']++;
	     }
	     boolean isDuplicate = false;
	     for(int i = 0; i < 26; i++){
	         if(AFreq[i] != BFreq[i]){
	           return false;
	         }
	         if(AFreq[i] > 1){
	           isDuplicate = true;
	         }
	     }
	     if(count != 2 && (count != 0 || !isDuplicate)){
	       return false;
	     }
	     return true;
	   }
	 public static boolean isAnagramTrueOrFalse(String str1 , String str2){
	       if(str1.length() != str2.length()) return false;
	       
	        int[] bucket = new int[26];
	        
	       for(int i = 0; i < str1.length() ; i++){
	           bucket[ str1.charAt(i) - 'a' ]++;
	           bucket[ str2.charAt(i) - 'a' ]--;
	       }
	       
	       for(int count : bucket){
	           if(count != 0){
	             return false;
	           }
	       }
	      return true;
	    }

}
