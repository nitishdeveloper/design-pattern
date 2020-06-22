package com.array.statistics.problem;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumSumCombinationsOfArray {

	public static void main(String[] args) {
		int A1[] = { 4, 2, 5, 1 }; 
        int A2[] = { 8, 0, 5, 3 }; 
        int K = 3; 
        maximumSumOfArray(A1 , A2 ,K);
	}
	
	public static void maximumSumOfArray(int A1[] , int A2[] , int k) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		
		for (int i = 0; i < A1.length; i++) {
			for (int j = i; j < (i+1); j++) {
				queue.add((A1[i] + A2[j]));
			}
		}
		
		int count = 0;
		while(count < k) {
			System.out.print(queue.peek()+" ");
			queue.remove();
			count++;
		}
		
		
	}

}
