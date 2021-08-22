package com.array.arrangement;

import java.util.Arrays;

public class MoveZerosToEndInArray {

	public static void main(String[] args) {
		int A[] = {1, 2, 0, 0, 0, 3, 6};
		moveZerosToEnd(A);
	}
	public static void moveZerosToEnd(int A[]) {
		
		System.out.println("Before :");
		System.out.println(Arrays.toString(A));
		int zero = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] != 0) {
				int temp = A[zero];
				A[zero] = A[i];
				A[i] = temp;
				System.out.println(Arrays.toString(A));
				zero++;
			}
		}
		System.out.println("total zeros :"+zero);
		System.out.println("After : ");
		System.out.println(Arrays.toString(A));
	}
}
