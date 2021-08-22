package com.other.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListOfAnagram {

	public static void main(String[] args) {
		String straa[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println("reverse : " + listOfAnagram("abab", "ab"));
	}

	public static String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();
		int length = ch.length;
		int first = 0;
		while (first < length) {
			int last = Math.min(first + k - 1, length - 1);
			swap(ch, first, last);
			first = first + (k * 2);
		}
		return String.valueOf(ch);
	}

	public static String reverseWords(String s) {
		StringBuilder builder = new StringBuilder();
		String[] str = s.split("\\s");
		for (String st : str) {
			System.out.println(st);
			String rev = reverse(st);
			builder.append(rev);
		}
		return builder.toString();
	}

	public static String reverse(String str) {
		char[] word = str.toCharArray();
		int start = 0;
		int end = word.length - 1;
		swap(word, start, end);
		return String.valueOf(word).concat(" ");
	}

	// swat utility
	public static void swap(char ch[], int start, int end) {
		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
	}

	public boolean isPalindrome(String s) {
		String str1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1.toLowerCase());
		Arrays.sort(str1.toCharArray());
		String str2 = new StringBuilder(str1).reverse().toString();
		System.out.println(str2.toLowerCase());
		if (str1.equalsIgnoreCase(str2)) {
			return true;
		}
		return false;
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList<>();
		}
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String str : strs) {
			char ch[] = str.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			map.get(key).add(str);
		}
		return new ArrayList<List<String>>(map.values());
	}

	public static boolean isAnagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch1) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (char chara : ch2) {
			if (map.containsKey(chara)) {
				map.put(chara, map.get(chara) - 1);
			}
		}

		for (Entry<Character, Integer> en : map.entrySet()) {
			if (en.getValue() != 0) {
				return false;
			}
		}
		ch1 = ch2 = null;
		map = null;
		return true;
	}

	/*
	 * Input: s: "cbaebabacd" p: "abc" Output:[0, 6] beeaaedcbc c
	 */
	public static List<Integer> findAnagrams(String s, String p) {
		if (s != null && !s.isEmpty() && p != null && !p.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			char[] ch = s.toCharArray();
			char[] ch2 = p.toCharArray();
			int start = 0, start_window = 0;
			int end = ch.length - 1;
			int end_window = p.length();
			char[] temp = new char[end_window];
			int count = 0, index = 0;
			while (start <= end) {
				while (start_window < end_window) {
					if (start_window <= end) {
						temp[index] = ch[start_window];
						start_window++;
						index++;
					} else {
						break;
					}
				}
				if (isAnagrams(String.valueOf(temp), String.valueOf(ch2))) {
					list.add(count);
				}
				count++;
				index = 0;
				end_window++;
				start_window = ++start;
				temp = new char[p.length()];
			}
			return list;
		}
		return new ArrayList<Integer>();
	}

	public static List<Integer> findAnagrams2(String s, String p) {
		int[] chars = new int[26];
		List<Integer> result = new ArrayList<>();

		if (s == null || p == null || s.length() < p.length())
			return result;
		for (char c : p.toCharArray())
			chars[c - 'a']++;

		int start = 0, end = 0, count = p.length();
		// Go over the string
		while (end < s.length()) {
			// If the char at start appeared in p, we increase count
			if (end - start == p.length() && chars[s.charAt(start++) - 'a']++ >= 0)
				count++;
			// If the char at end appeared in p (since it's not -1 after decreasing), we
			// decrease count
			if (--chars[s.charAt(end++) - 'a'] >= 0)
				count--;
			if (count == 0)
				result.add(start);
		}

		return result;
	}

	public static List<Integer> findAnagrams3(String s, String p) {
		List<Integer> result = new ArrayList<>();
		if (s == null || s.length() == 0 || p.length() > s.length()) {
			return result;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < p.length(); i++) {
			char c = p.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		int match = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
				if (map.get(c) == 0) {
					match++;
				}
			}
			if (i >= p.length()) {
				c = s.charAt(i - p.length());
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
					if (map.get(c) == 1) {
						match--;
					}
				}
			}
			if (match == map.size()) {
				result.add(i - p.length() + 1);
			}
		}
		return result;
	}

	public static List<Integer> listOfAnagram(String str, String pair) {
		List<Integer> result = new ArrayList<>();
		if (str == null || str.length() == 0) {
			return result;
		}
		if (pair.length() > str.length()) {
			return result;
		}

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < pair.length(); i++) {
			char c = pair.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		int match = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
				if (map.get(c) == 0) {
					match++;
				}
			}
			if (i >= pair.length()) {
				c = str.charAt(i - pair.length());
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
					if (map.get(c) == 1) {
						match--;
					}
				}
			}
			if (match == map.size()) {
				result.add(i - pair.length() + 1);
			}
		}
		return result;
	}
}
