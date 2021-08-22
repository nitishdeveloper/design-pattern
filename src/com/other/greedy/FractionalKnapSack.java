package com.other.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {

	public static void main(String[] args) {
		int[] wt = {5, 10, 20, 30, 40}; 
        int[] val = {30, 20, 100, 90,160}; 
        int capacity = 60; 
  
        double maxValue = fractionalKnapsack(val, wt, capacity , wt.length); 
        System.out.println("Maximum value we can obtain = " +  maxValue); 

	}
	
	public static double fractionalKnapsack(int[] profit ,int[] weight , int capacity , int n) {
		
		Items [] items = new Items[n];
		
		for (int i = 0; i < n; i++) {
			items[i] = new Items(profit[i] , weight[i] , i);
		}
		
		Arrays.sort(items , new Comparator<Items>() {
			@Override
			public int compare(Items item1, Items item2) {
				return item2.cost.compareTo(item1.cost);
			}
			});
		
			double totalValue = 0;
			
		   for(Items item : items) {
			    double currentWeight = item.weight;
			    double currentProfit = item.profit;
			    
			    if(capacity - currentWeight >= 0) {
			    	capacity -= currentWeight;
			    	totalValue += currentProfit;
			    }else {
			    	double fractional = capacity / currentWeight;
			    	totalValue += (currentProfit * fractional);
			    	capacity = (int) (capacity - (currentWeight * fractional));
			    	break;
			    }
			    
			    
		   }
		return totalValue;
	}
	
	 static class Items{
		Double cost;
		double weight , profit, index;
		public Items(int profit, int weight, int index) {
			this.profit = profit;
			this.weight = weight;
			this.index = index;
			cost = new Double(profit / weight);
		}
	}

}
