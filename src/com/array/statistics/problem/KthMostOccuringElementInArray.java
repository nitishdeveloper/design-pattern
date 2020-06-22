package com.array.statistics.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class KthMostOccuringElementInArray {

	public static void main(String[] args) {
		int arr[] = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9}; 
	    int k = 2; 
	    kthMostOccuringElement(arr , k);

	}
	
	public static void kthMostOccuringElement(int[] arr , int k) {
		
		Arrays.sort(arr);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i] , map.get(arr[i])+1);
			}else {
				map.put(arr[i] , 1);
			}
		}
		
		System.out.println(map);
		
		 for(Entry<Integer, Integer> entry : map.entrySet()) {
			 if(entry.getValue() > 1) {
				 System.out.println("key : "+entry.getKey() +" : "+entry.getValue());
			 }
		 }
	}

}
