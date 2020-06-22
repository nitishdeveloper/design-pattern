package com.array.arrangement.problem;

import java.util.Arrays;

public class RearrangUsingEvenAndOddPosition {
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4 ,5, 6, 7, 8 };
		evenNumbersAtEvenIndexAndOddNumbersAtOddIndex(A);
		
		for(int V : A) {
			System.out.print(V+" ");
		}
	}
//	Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
	public static void rearrangeEvenOddPostionWithTheirValues(int A[]) {
		int size = A.length;
		int[] temp = new int[size];
		
		for (int i = 0; i < size; i++) {
				temp[i] = A[i];
		}
		Arrays.sort(temp);
		int even = size / 2;
		int odd = size - even;
		int j = odd-1;
		
		//fill up odd position in original array 
		for (int i = 0; i < size; i+=2 ) {
			 A[i] = temp[j];
			 j--;
		}
		//fill up even position in original array 
		j = odd;
		for (int i = 1; i < size; i+=2) {
			A[i] = temp[j];
			j++;
		}
		
		temp = null;
	}
	
//	Even numbers at even index and Odd numbers at odd index
	public static void evenNumbersAtEvenIndexAndOddNumbersAtOddIndex(int A[]) {
		
		int size =  A.length;
		int even = 0;
		int odd = 1;
	 while(true) {
//		while(even < size && A[even] % 2 == 0) { 
//			even+=2;
//		}
//		while(odd < size && A[odd] % 2 == 1) { 
//			odd+=2;
//		}
		if(even < size && odd < size) {
			int temp = A[even];
			A[even] = A[odd];
			A[odd] = temp;
			even+=2;
			odd+=2;
		}
		else {
			break;
		}
	  }
	}
	
	
}
