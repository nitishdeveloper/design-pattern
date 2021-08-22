package com.array.statistics;

public class FindSmallestAndLargestElementInArray {

	public static void main(String[] args) {
		 int arr[] = {12, 13, 1, 10, 34, 2, -1};
		 findThreeSmallestElement(arr);
		 findThreeLargestElement(arr);
	}
	
	public static void findThreeSmallestElement(int A[]) {
		
		int first = A[0] , second = 0 , third = 0;
		
		
		for (int i = 0; i < A.length; i++) {
			if(first > A[i]) {
				third = second;
				second = first;
				first = A[i];
			}
			else if(second > A[i]) {
				third = second;
				second = A[i];
			}
			else if(third > A[i]) {
				third = A[i];
			}
		}
		System.out.println("Fisrt Smallest : "+first+" Second Smallest : "+second+" Third Smallest : "+third);
	}

	public static void findThreeLargestElement(int A[]) {

		int first = A[0], second = 0, third = 0;

		for (int i = 0; i < A.length; i++) {
			if (first < A[i]) {
				third = second;
				second = first;
				first = A[i];
			} 
			else if (second < A[i]) {
				third = second;
				second = A[i];
			} 
			else if (third < A[i]) {
				third = A[i];
			}
		}
		System.out.println("Fisrt Largest : " + first + " Second Largest : " + second + " Third Largest : " + third);
	}
}
