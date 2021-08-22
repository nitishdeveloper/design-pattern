package com.array.statistics;

import java.util.Arrays;
import java.util.Collections;

public class PrintSmallestLargestKthElement {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] {12, 3, 5, 7, 19}; 
		int k = 3; 
		kthSmallestElement(arr , k);
	}
	
	
	public static void kthlargestElement(Integer arr[] , int k) {
		Arrays.sort(arr , Collections.reverseOrder());
		System.out.println("kth largest elements");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void kthSmallestElement(Integer arr[] , int k) {
		Arrays.sort(arr);
		System.out.println("kth smallest elements");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
