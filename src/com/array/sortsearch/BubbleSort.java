package com.array.sortsearch;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int A[] = {12,5,8,11,2,1,43,31,29};
		bubbleSortRecursive(A , A.length );
		System.out.println(Arrays.toString(A));
	}
	
	public static void bubbleSortIterative(int A[]) {
		int n = A.length-1;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1; j++) {
				if (A[j] > A[j+1]) {
					int temp  = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
					count++;
				}
			}
		}
		System.out.println("Total swapping : "+count + " : "+Arrays.toString(A));
	}
	
	public static void bubbleSortRecursive(int A[] , int n) {
		//base condition
		if(n == 1) {
			return;
		}
		
		for (int j = 0; j < n-1; j++) {
			if (A[j] > A[j+1]) {
				int temp  = A[j];
				A[j] = A[j+1];
				A[j+1] = temp;
			}
		}
		bubbleSortRecursive(A , n-1);
		
	}
}
