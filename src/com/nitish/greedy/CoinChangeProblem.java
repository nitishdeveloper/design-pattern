package com.nitish.greedy;

import java.util.Arrays;
import java.util.Collections;

public class CoinChangeProblem {

	public static void main(String[] args) {
		Integer[] coins = {1, 2 , 5 , 10 , 20 , 50 , 100 , 200 , 500 , 2000};
		findMinCoins(coins , 40 , coins.length);
	}
	
	public static void findMinCoins(Integer[] coins , int change , int n) {
		Arrays.sort(coins , Collections.reverseOrder());
 		int count = 0;
		for (int i = 0; i < n;  i++) {
			 while(coins[i] <= change) {
				 System.out.print(coins[i]+" ");
				 change -= coins[i];
				 count++;
			 }
			 if(change == 0) {
				 break;
			 }
		}
		System.out.println();
		System.out.println("Total Coins Required : "+count);
	}

}
