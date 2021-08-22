package com.array.statistics;

import java.util.PriorityQueue;

public class KthLargestSumSubArray {

	public static void main(String[] args) {
		 int a[] = new int[]{ 20, -5, -1 }; 
	        int n = a.length; 
	        int k = 3; 
	        System.out.println(kthLargestSumInSubarray(a , n , k));
	}
	
	public static int kthLargestSumInSubarray(int A[] , int n , int k) {
		
		int sum[] = new int[n+1];
		
		sum[0] = 0;
		sum[1] = A[0];
		
		for (int i = 2; i <= n; i++) {
			 sum[i] = sum[i-1] + A[i-1];
		}
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for (int i = 1; i <= n; i++) {
			 for (int j = i; j <= n; j++) {
				int x = sum[j] - sum[i-1];
				
				if (queue.size() < k) { 
					  queue.add(x);
				}
				else {
					if (queue.peek() < x){ 
						  queue.poll();
						  queue.add(x); 
                      } 
				  }
			  }
		 }
		 return queue.poll(); 
	}

}
