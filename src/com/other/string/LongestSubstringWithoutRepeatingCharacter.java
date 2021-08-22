package com.other.string;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		longestSubstringWithoutRepeatingCharacter("abacdcf");
	}
	
	
	public static void longestSubstringWithoutRepeatingCharacter(String s) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int len = 0, start=0;
        
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=start) {
                start = map.get(s.charAt(i))+1;
                map.put(s.charAt(i),i); 
            }
            else {
                map.put(s.charAt(i),i);
            }
            len = Math.max(len,i-start+1);
        }
		
		System.out.println("max : "+len);
		System.out.println("map : "+map);
	}
}
