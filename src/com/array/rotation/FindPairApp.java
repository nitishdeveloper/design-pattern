package com.array.rotation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairApp {
	public static void main(String...strings ) {
		int A[] = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		findPairApprochThree(A, sum);
	}
	
	// when array is an sorted form
	public static void findPairApprochOne(int A[], int actualResult) {
		int finalResult = 0;

		if (A.length > 0) {
			for (int i = 0; i < A.length; i++) {
				for (int j = i + 1; j < A.length; j++) {
					finalResult = A[i] + A[j];
					if (finalResult == actualResult) {
						System.out.println(
								"Pair found at index " + A[i] + " and " + A[j] + " sum : " + finalResult);
					}

				}
			}

		}

	}
	
	//when array is in sorted form
	public static void findPairApprochTwo(int A[], int actualResult) {
		
		Arrays.sort(A);
		
		int low = 0;
		int high = A.length-1;
		
		while(low < high) {
			
			 if(A[low]+A[high] == actualResult) {
				 System.out.println("pair found");
			 }
			 
			 if(A[low]+A[high] < actualResult) {
				 low++;
			 }else {
				 high--;
			 }
		}
		
	}
	
	// using hashing technique
	public static void findPairApprochThree(int A[], int actualResult) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < A.length; i++) {
			 if(map.containsKey(actualResult - A[i])) {
				  System.out.println("pair "+(A[map.get(actualResult - A[i])]+A[i]));
			 }
			map.put(A[i], i) ;
		}		
	}
}
