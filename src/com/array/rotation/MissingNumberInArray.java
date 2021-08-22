package com.array.rotation;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {

	public static void main(String[] args) {
//		System.out.println(missingNumber(new int[] {1,2,3,4,5,6,7,8,10},10));
		missingNumberMoreThanOne(new int[] {1,2,3,4,6,7,8,10},10);
	}
	
	public static int missingNumber(int array[] , int numbers) {
		
		int actualSum = (numbers * (numbers+1)/2);
		System.out.println("actualSum : "+actualSum);
		int currentSum = 0;
		for(int num : array) {
			currentSum+=num;
		}
		System.out.println("currentSum : "+currentSum);
		return actualSum - currentSum;
	}
	
	public static void missingNumberMoreThanOne(int array[] , int numbers) {
		int missingCount = numbers - array.length;
		BitSet bitSet = new BitSet();
		
		for(int num : array) {
			bitSet.set(num-1);
		}
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(array), numbers);
		
		int lastMissingIndex = 0;
		
		for(int i=0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
}
