package com.array.sort.search;

public class BinarySearch {

	public static void main(String[] args) {
		int A[] = {11 , 12 , 22 , 25 , 34 , 64 , 90 , 95};
		int n = A.length-1;
		int key = 64;
		binaryaSearchIterative(A , n , key);
	}
	
	public static void binaryaSearchIterative(int A[] , int n , int key) {
		
		int low = 0;
		int high = n;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(key == A[mid]) {
				System.out.printf("This %d element found at %d position",key ,mid);
			}
			if(key > A[mid]){
				 low = mid+1;
			}
			else {
				  high = mid - 1;
				}
			}	
		}
}
