package com.array.rotation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CircularArrayRotationApp {

	public static void main(String[] args) {
		int A[] = { 1, 3, 2, 4, 7, 6, 5};
//		circularRotation(A);
//		ArrayRotationApp.print(A);
		sortAndRotateAndFindPair(A,2,10);
	}
	
	public static void circularRotation(int A[]) {
		
		int lastIndexValue = A[A.length-1];
		
		for (int i = A.length-1; i >0; i--) {
			A[i] = A[i-1];
		}
		A[0] = lastIndexValue;
	}
	
	public static void sortAndRotateAndFindPair(int A[] , int d , int p) {
		Arrays.sort(A);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		System.out.println("Sorted Array : ");
		for(int a : A) {
			System.out.print(a+" ");
		}
		System.out.println();
		for (int i = 0; i < A.length; i++) {
			  if(map.containsKey(p-A[i])) {
				 int result = (A[map.get(p - A[i])] + A[i]);
				 System.out.println("result : "+result);
			  }
			  map.put(A[i],i);
		}
		
		
		ArrayRotationApp.jugglingRotationAlgo(A, A.length, d);
		
	}
	
}
