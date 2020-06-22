package com.array.sort.search;

import java.util.Arrays;

public class MergeShort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		int[] AUX = Arrays.copyOf(arr, arr.length);
		  
        System.out.println("Befor sorting"); 
        System.out.print(Arrays.toString(arr)); 
  
        sort(arr,AUX, 0 , arr.length-1); 
  
        System.out.println("\nSorted array");
        System.out.print(Arrays.toString(arr)); 
	}

	
	public static void sort(int A[] ,int AUX[] , int low , int high) {
		

		if(low == high) {
			return;
		}
			int mid = (low + high)/2;
			sort(A ,AUX , low , mid);
			sort(A ,AUX , mid+1,high);
			merge(A , AUX, low , mid , high);
		
	}
	
	public static void merge(int A[] , int AUX[] , int low , int mid, int high ) {
		
		int k = low;
		int i = low;
		int j = mid+1;
		
		while(i <= low  && j <= high) {
			  if(A[i] < A[j]) {
				  AUX[k++] = A[i++];
			  }
			  else {
				  AUX[k++] = A[j++];
			  }
		}
		
		while(i <= mid) {
			AUX[k++] = A[i++];  
		}
		
		for (i = low; i <= high; i++) {
			A[i] = AUX[i];
		}
		
	}
}
