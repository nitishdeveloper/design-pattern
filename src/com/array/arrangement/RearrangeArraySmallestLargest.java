package com.array.arrangement;

import java.util.Arrays;

public class RearrangeArraySmallestLargest {

	public static void main(String[] args) {
		int A[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};
		rearrange(A);
	}
	
	/*
	 * Given an array of integers, task is to print the array in the order –
	 * smallest number, Largest number, 2nd smallest number, 2nd largest number, 3rd
	 * smallest number, 3rd largest number and so on
	 * output : {1, 9, 2, 8, 3, 7, 4, 6, 5}
	 */	
	
	public static void rearrange(int A[]) {
		
		Arrays.sort(A);
		System.out.println("Before :");
		System.out.println(Arrays.toString(A));
		
		int odd = 1 , even = 0;
		int n = A.length;
		int largest = n-1;
		int temp[] = new int[n];
		
		for (int i = 0; i < n-1;i++) {
			temp[even] = A[i];
			 if(odd<n) {
				 temp[odd] = A[largest];
				 odd+=2;
				 even+=2;
				 largest--;
			 }else {
				 break;
			 }
		}
		
		for (int i = 0; i < temp.length; i++) {
			A[i] = temp[i];
		}
		
		System.out.println("After : ");
		System.out.println(Arrays.toString(A));
		
	}

}
