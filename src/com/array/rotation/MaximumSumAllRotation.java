package com.array.rotation;

public class MaximumSumAllRotation {

	public static void main(String[] args) {
		int arr[] = {8, 3, 1, 2}; 
        int n = arr.length; 
        System.out.println(maximum(arr, n)); 
	}
	
	public static int maximum(int A[] , int n) {
		
		int arraySum = 0;
		int currentSum = 0;
		
		for (int i = 0; i < n; i++) {
			arraySum += A[i];
			currentSum += i*A[i];
		}
		
		
		int result  = currentSum;
		
		for (int i = 1; i < n; i++) {
			
			System.out.println("currentSum : "+currentSum+" arraySum : "+arraySum
					           +" array : "+A[i-1] + " length : "+(n-1));
			
			int nextVal = currentSum - (arraySum - A[i-1]) + A[i-1] * (n-1);
			currentSum = nextVal;
			
			
			System.out.println("R"+i+" : "+nextVal);
			
			result = Math.max(result, nextVal);
		}
		
		
		return result;
	}
}
