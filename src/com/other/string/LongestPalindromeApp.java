package com.other.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class LongestPalindromeApp {

	public static void main(String[] args) {
//		System.out.println(longestPanlindromeSubString("abac"));
//		countSubstrings("abc");
	}

	public static String longestPanlindromeSubString(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			String even = checksubstring(str, i, i);

			String odd = checksubstring(str, i, i + 1);

			String str1 = even.length() > odd.length() ? even : odd;

			result = str1.length() > result.length() ? str1 : result;
		}
		return result;
	}

	public static String checksubstring(String str, int start, int end) {

		while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
			start--;
			end++;
		}
		return str.substring(start + 1, end);
	}

	public static void countSubstrings(String s) {
		int count = 0;
		int val = 2 * s.length() - 1;
		for (int i = 0; i < val; i++) {
			int start = i / 2;
			int end = start + i % 2;
			while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
				count++;
				start--;
				end++;
			}
			System.out.println(s.substring(start + 1, end));
		}
		System.out.println("count : " + count);
	}

	public static void mapSorting(String s) {
		int len = s.length();
		Map<Character, Integer> map = new  HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new  HashMap<Character, Integer>();
		StringBuilder build = new StringBuilder();
		StringBuilder build2 = new StringBuilder();
		for (int i = 0; i < len; i++) {
			 if(map.containsKey(s.charAt(i))) {
				 map.put(s.charAt(i) , map.get(s.charAt(i)));
			 }else {
				 map.put(s.charAt(i) , 1);
			 }
			 
			 map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0)+1);
		}
		
//		System.out.println(map2);
		
		map.entrySet().stream().forEach(val->{
			build.append(Character.toString(val.getKey())).toString();
		}); 
		
	/*	map2.entrySet().stream().sorted(Map.Entry.<Character , Integer>comparingByValue().reversed())
		.forEach(data ->{
			Character  key = data.getKey();
			int val = data.getValue();
			for (int i = 0; i < val; i++) {
				build2.append(key);
			}
		});
*/		
		List<Map.Entry<Character , Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map2.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
//		Map<Character , Integer> mp = new LinkedHashMap<Character, Integer>();
		
/*		
		list.forEach(data ->{
			mp.put(data.getKey(),data.getValue() );
		});
*/		
		
		map2.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue ,(k,v) ->k , LinkedHashMap:: new));
	
		System.out.println(build.toString());
		System.out.println(map2);
	}
}
