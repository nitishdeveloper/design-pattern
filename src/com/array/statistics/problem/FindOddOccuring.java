package com.array.statistics.problem;

public class FindOddOccuring {

	public static void main(String[] args) {
		int[] arr = {1,4,6,1,4,1,6,4,2,2,1};
		
		System.out.println("Odd occurring element is " + findOddOccuring(arr));
	}
	
	public static int findOddOccuring(int A[]) {
		
		int odd_count = 0;
		
		for (int i = 0; i < A.length; i++) {
			 odd_count = odd_count ^ A[i];
		}
		
		return odd_count;
		
	}

}
