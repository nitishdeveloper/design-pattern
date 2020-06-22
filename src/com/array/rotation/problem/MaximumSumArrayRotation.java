package com.array.rotation.problem;

public class MaximumSumArrayRotation {

	public static void main(String[] args) {
		int A[] = {1, 20, 2, 10};
		System.out.println("maximum sum : "+maxVal(A));
	}

	public static int maxVal(int A[]) {
		int n = A.length;
		// Find array sum and i*arr[i] with no rotation 
		int arraySum = 0;
		int currentSum = 0;
		
		for (int i = 0; i < n; i++) {
			 arraySum +=A[i];
			 currentSum += i*A[i];
		}
		
		// Initialize result as 0 rotation sum
		int maxVal = currentSum;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("R"+(i-1)+" currentSum : "+currentSum+" arraySum : "+arraySum
			           +" n : "+n + " array : "+A[n-i]);
			currentSum = currentSum + arraySum - n * A[n-i];
			if (currentSum > maxVal) {
				maxVal = currentSum;
			}
		}
		 return maxVal;
	}
	
	public static void print(int A[]) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}
