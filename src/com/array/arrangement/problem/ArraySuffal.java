package com.array.arrangement.problem;

import java.util.Arrays;
import java.util.Random;

public class ArraySuffal {

	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8}; 
//         randomize(arr); 
		   segregateEvenOdd(arr);
	}
	
	/* Shuffle a given array using Fisher–Yates shuffle Algorithm */
	public static void randomize(int a[]) {
		System.out.println("before");
		System.out.println(Arrays.toString(a)); 
		
		int n = a.length;
		
		Random random = new Random();
		
		for (int i = 0; i < n-1; i++) {
			 
			 int ran = random.nextInt(i+1);
			 System.out.println("rand value : "+ran);
			 int temp = a[i];
			 a[i] = a[ran];
			 a[ran] = temp;
		}
		System.out.println("\nbefore");
		System.out.println(Arrays.toString(a)); 
	}
	
	/*
	 * Given an array of integers, segregate even and odd numbers in the array. All
	 * the even numbers should be present first, and then the odd numbers.
		Input : 1 3 2 4 7 6 9 10
		Output : 2 4 6 10 7 1 9 3
	 */
	public static void segregateEvenOdd(int a[]) {
		System.out.println("before");
		System.out.println(Arrays.toString(a)); 
		int pos = 0;
		for (int i = 0; i < a.length; i++) {
			 
			 if(a[i]%2 == 0) {
				 int temp = a[i];
				 a[i] = a[pos];
				 a[pos] = temp;
				 pos++;
			 }
		}
		System.out.println("\nbefore");
		System.out.println(Arrays.toString(a));
	}

}
