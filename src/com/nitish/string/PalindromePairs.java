package com.nitish.string;

import java.util.*;

public class PalindromePairs {

	public static void main(String[] args) {
		String[] str = { "a", "" };
		System.out.println(palindromeList(str));

	}

	public static List<List<Integer>> palindromeList(String[] words) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(words == null || words.length == 0){
	        return result;
	    }
		HashMap<String,Integer>  map = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			map.put(words[i] , i);
		}
		
	    if(map.containsKey("")){
	        int blankIdx = map.get("");
	        for(int i = 0; i < words.length; i++){
	            if(isPalindrome(words[i])){
	                if(i == blankIdx) {continue;}
	                result.add(Arrays.asList(blankIdx, i));
	                result.add(Arrays.asList(i, blankIdx));
	            }
	        }
	    }
	    
	    for(int i = 0; i < words.length; i++){
	        String reverse = reverse(words[i]);
	        if(map.containsKey(reverse)){
	            int found = map.get(reverse);
	            if(found == i) {continue;}
	            result.add(Arrays.asList(i, found));
	        }
	    }
		
		for (int i = 0; i < words.length; i++) {
			String str = words[i];
			for (int j = 1; j < str.length(); j++) {
				if(isPalindrome(str.substring(0, j))) {
					 String reverseStr = reverse(str.substring(j));
					if(map.containsKey(reverseStr)) {
						int found = map.get(reverseStr);
						if(found == i) {continue;}
						result.add(Arrays.asList(found ,i));
					}
				}
				
				if(isPalindrome(str.substring(j))) {
					String reverseStr = reverse(str.substring(0,j));
					if(map.containsKey(reverseStr)) {
						int found = map.get(reverseStr);
						if(found == i) {continue;}
						result.add(Arrays.asList(i , found));
					}
				}
			}
		}
		return result;
	}
	
	
	public static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		while(start <= end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static String reverse(String str) {
		StringBuilder builder = new StringBuilder(str);
		return builder.reverse().toString();
	}
}
