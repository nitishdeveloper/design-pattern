package com.array.arrangement.problem;

import java.util.Arrays;

public class RearrangeArrayPostiveNativeValues {

	public static void main(String[] args) {
		int A[] = {-1, 2, -3, -4, -5, 6, -7, 8, 9}; 
        int n = A.length;
        rearrange(A , n);
	}
	
//	Rearrange the array elements so that positive and negative numbers are placed alternatively. 
//	Number of positive and negative numbers need not be equal. 
//	If there are more positive numbers they appear at the end of the array. 
//	If there are more negative numbers, they too appear in the end of the array.
	public static void rearrange(int A[] , int n) {
		
		Arrays.sort(A);
		
		System.out.println("Sorted Array :");
		System.out.println(Arrays.toString(A));
		
		int positive = 0;
		int temp = 0;
		
		for (int i = 0; i < n-1; i++) {
			 if(A[i] < 0) { 
				 positive++;
			 }
		}
		
		 int negative = 0 , length = n-1;
			 while(A[negative] < 0 && negative < length) {
				 temp = A[negative];
				 A[negative] = A[positive];
				 A[positive] = temp;
				 negative+=2;
				 positive++;
			 }
		
		System.out.println("Negative Count : "+positive );
		
		System.out.println("Positive and Negative position : ");
		System.out.println(Arrays.toString(A));
	}

}
