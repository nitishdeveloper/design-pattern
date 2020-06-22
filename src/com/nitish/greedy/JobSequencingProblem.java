package com.nitish.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingProblem {

	public static void main(String[] args) {
		
		String[] jobs = { "J1" , "J2" , "J3" , "J4" , "J5"};
		int[]  deadlines = { 2, 1, 3, 2, 1,};
		int[]  profits = {60 ,100 , 20, 40 , 20};
		jobSequencing(jobs , deadlines , profits , jobs.length);
	}
	
	public static void jobSequencing(String[] jobs , int[] deadlines , int[] profits , int n) {
		
		Boolean[] slot = new Boolean[n];
		for (int i=0; i<n; i++) { 
	        	slot[i] = false;
			}
		
		Job[] job = new Job[n];
		for (int i = 0; i < n; i++) {
			  job[i] = new Job(jobs[i], deadlines[i], profits[i]);
			}
		
		Arrays.sort(job , new Comparator<Job>() {
			@Override
			public int compare(Job o1, Job o2) {
				return o2.profit.compareTo(o1.profit);
			}
		});
		
		int maxProfit = 0;
		for (int i = 0; i < n; i++) {
			for (int j = Integer.min(n, job[i].deadline)-1; j>=0; j--) {
		          if (slot[j]==false){ 
		        	  maxProfit = maxProfit + job[i].profit; 
		        	  System.out.println("Job : " + job[i].jobId);
		              slot[j] = true;
		              break; 
		          } 
			}
		}
		System.out.println("maxProfit : " + maxProfit);
	}
	
	static class Job{
		String jobId;
		int deadline;
		Integer profit;
		
		private Job(String jobId, int deadline, int profit) {
			this.jobId = jobId;
			this.deadline = deadline;
			this.profit = profit;
		}		
	}
}
