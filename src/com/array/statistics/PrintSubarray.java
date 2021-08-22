package com.array.statistics;

import java.math.BigInteger;

public class PrintSubarray {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,5};
		String str = "abcde";
		subsequenceOfString(str);
	}
	
	public static void subarray(int A[]) {
		for(int i = 0; i < A.length; i++) {
				for(int j = i; j < A.length; j++) {
						for(int k = i; k < j; k++) {
							  System.out.print(A[k]+" ");
					}
							  System.out.println();
				}
			}		
		}
	
	public static void subsequenceOfString(String str) {
		for(int i = 0; i < str.length(); i++) {
				for(int j = i; j < str.length(); j++) {
						for(int k = i; k < j; k++) {
							  System.out.print(str.charAt(k));
					}
							  System.out.println();
				}
			}		
		}
	
	public static void subsequence(int A[]) {
		
		int noOfSubsequnces = (int) Math.pow(2, A.length)-1;
//		System.out.println(noOfSubsequnces);
		
		for(int i = 1 ; i < noOfSubsequnces ; i++) {
			for (int j = 0; j < A.length-1; j++) {
				if(BigInteger.valueOf(i).testBit(j)) {
					 System.out.print(A[j]+" "); 
				}
			}
			System.out.println(); 
		}
	}
}
