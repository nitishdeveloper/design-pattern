package com.array.arrangement.problem;

import java.util.Arrays;

public class RearrangePositiveNetiveEvenOdd {

	public static void main(String[] args) {
//		int A[] = {1, -3, 5, 6, -3, -2, 7, -4, 9, -6};
		int arr[] = { 6, 4, 2, 1, 8, 3 }; 
		rearrangeArray(arr);
		
	}
	
	/*
	 * You have been given an array and you have to make a program to convert that
	 * array such that positive elements occur at even numbered places in the array
	 * and negative elements occur at odd numbered places in the array. We have to
	 * do it in place.
	 */	public static void rearragne(int A[]) {
		 
		 
//		 Arrays.sort(A);
		 
		 System.out.println("Before :");
		 System.out.println(Arrays.toString(A));
			
		int even = 0 , odd = 1;
		int n = A.length;
		int temp;
	
		while(true) {
			while (even < n && A[even] >= 0) {
				even+=2;
			}
			while (odd < n && A[odd] <= 0) {
				odd+=2;
			}
			if(even < n && odd < n) {
				temp = A[even];
				A[even] = A[odd];
				A[odd] = temp;
			}
			else {
				break;
			}
		}
		System.out.println("After2 :");
		System.out.println(Arrays.toString(A));

	 }
	 
	 /*Rearrange array such that even index elements are smaller and odd index elements are greater*/
	 	public static void rearrangeArray(int A[]) {
	 		
	 		for (int i = 0; i < A.length-1; i++) {
				if(i % 2 == 0 && A[i] > A[i + 1]) {
					swap(A , i , i+1);
				}
				if(i % 2 != 0 && A[i] < A[i + 1]) {
					swap(A , i , i+1);
				}
			}
	 		
	 		System.out.println("After2 :");
			System.out.println(Arrays.toString(A));
	 	}
	 	
	 	public static int[] swap(int A[] , int a , int b) {
	 		int temp = A[a];
	 		A[a] = A[b];
	 		A[b] = temp;
	 		return A;
	 	}
}
