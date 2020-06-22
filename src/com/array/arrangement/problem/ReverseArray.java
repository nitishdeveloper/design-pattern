package com.array.arrangement.problem;

public class ReverseArray {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,5,6,7,8};
		reverse(A , 0 , A.length-1);
		
		for(int v : A) {
			System.out.print(v+" ");
		}
	}
	
	public static void reverse(int A[] , int start , int end) {
		int temp;
		if(start >= end) {
			return;
		}
		temp = A[start];
		A[start] = A[end];
		A[end] = temp;
				
		reverse(A , start+1 , end-1);
	}

}
