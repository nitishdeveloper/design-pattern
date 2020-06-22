package com.array.statistics.problem;

import java.util.Arrays;

public class FindMeanAndMedianInArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 }; 
		meanAndMedian(a);
	}
	
	public static void meanAndMedian(int A[]) {
		Arrays.parallelSort(A);
		int n = A.length;
		double mean = 0;
		int median = 0;
		
		for (int i = 0; i < A.length; i++) {
			 mean+=A[i];
		}
		mean/=n;
		
		if(n % 2 == 0) {
			median = A[n/2];
		}else {
			median = A[(n+1)/2];
		}
		
		System.out.println("Mean : "+mean +" median : "+median);
	}
	/*
	 * public List<Integer> topKFrequent(int[] nums, int k) { //k most frequent
	 * element int count = 0; Map<Integer,Integer> map = new HashMap<>();
	 * List<Integer> result = new ArrayList<>(); for(int i = 0; i <
	 * nums.length;i++){ if(map.containsKey(nums[i])){
	 * map.put(nums[i],map.get(nums[i])+1); }else map.put(nums[i],1); }
	 * 
	 * while(count < k){ int max = 0; int value = 0; for(Map.Entry<Integer, Integer>
	 * entry: map.entrySet()){ max = Math.max(max, entry.getValue());
	 * if(entry.getValue() >= max){ max = entry.getValue(); value = entry.getKey();
	 * } } map.remove(value); result.add(value); count++; } return result; }
	 */
}
