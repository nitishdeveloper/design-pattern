package com.array.statistics;

public class MaximumSumInSubarrayKadaneAlgo {

	public static void main(String[] args) {
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		kadaneAlgo(A);
	}
	
	public static void kadaneAlgo(int A[]) {
		
		int max_so_far = A[0];
		int max_end_here = A[0];

		
		//using dp
		for (int i = 0; i < A.length; i++) {
			
			max_end_here = max_end_here + A[i]; 
			max_end_here = Integer.max(max_end_here, A[i]);
			max_so_far = Integer.max(max_so_far , max_end_here);
			
		}
		
		int maxSoFar = 0;
		int maxEndingHere = 0;
	    int start = 0; 
	    int end = 0;
		//without dp
		for (int j = 0; j < A.length; j++) {
			maxEndingHere +=  A[j];
			if(maxSoFar < maxEndingHere) {
				maxSoFar = maxEndingHere;
				end = j;
			}
			if(maxEndingHere < 0) {
				maxEndingHere = 0;
				start = j+1;
			}
			
		}
		
		System.out.print("The contiguous sub-array : ");
		for (int i = start; i <= end; i++) {
			System.out.print(A[i] + " ");
		}
		
		System.out.println("\nstart : "+start + " end : "+end+" max_so_far : "+max_so_far);
	}

}
