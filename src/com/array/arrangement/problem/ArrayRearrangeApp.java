package com.array.arrangement.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayRearrangeApp {

	public static void main(String[] args) {
		int A[] = {-1, -1, 6, 1,9, 3, 2, -1, 4,-1};
//		A = rearranging(A);
		
		System.out.println(Arrays.toString(rearrangingApproch3(A)));
		
	}
//	Rearrange an array such that arr[i] = i
	public static int[] rearranging(int A[]) {
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] != -1 && A[i] != i) {
			int x = A[i];
			
			while(A[x] != -1 && A[x] != x) {
				int y = A[x];
				A[x] = x;
				x = y;
			}
			A[x] = x;
			if(A[i] != i) {
				A[i] = -1;
			}
		  }
		}
		
		return A;
	}
	
	
	public static int[] rearrangingApproch2(int A[]) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int val : A) {
			set.add(val);
		}
		
		System.out.println(set);
		for (int i = 0; i < A.length; i++) {
			if(set.contains(i)) {
				A[i] = i;
			}else {
				A[i] = 0;
			}
		}
		return A;
	}
	
	
	public static int[] rearrangingApproch3(int A[]) {
		
		for (int i = 0; i < A.length;) {
			 if(A[i] > 0  && A[i] != i) {
				 int temp_I = A[i];
				 int temp = A[temp_I];
				 A[temp_I] = temp_I;
				 A[i] = temp;
			 }
			 else {
				 i++;
			 }
		}
		return A;
		
	}

	

}
