package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> l1 = Arrays.asList(11,2,4);
		List<Integer> l2 = Arrays.asList(4,5,6);
		List<Integer> l3 = Arrays.asList(10,8,-12);
		list.add(l1);list.add(l2);list.add(l3);
		
		
	}
	public static int diagonalDifference(List<List<Integer>> arr) {
        int SIZE = arr.size();
        System.out.println("SIZE : "+SIZE);
        int SUM_1 = 0;
        int SUM_2 = 0;
        Integer RESULT = 0;
        for(int i = 0; i < SIZE;  i++){
            for(int j = 0; j < SIZE; j++){
                 if(i == j){
                     System.out.print(arr.get(i).get(j) +" ");
                      SUM_1 += arr.get(i).get(j);
                 }
            }
        }
        System.out.println();
        
        for(int i = 0; i < SIZE;  i++){
        	for(int j = 0; j < SIZE; j++){
        		System.out.println((i+j)+" "+(SIZE-1));
                 if((i+j) == (SIZE-1)){
                     System.out.print(arr.get(i).get(j) +" ");
                     SUM_2 += arr.get(i).get(j);
                 }
            }
        }
   
        RESULT = Math.abs( SUM_1 - SUM_2 );
        
        double salary = Math.round(2 * 100.0) / 100.0;
      
        
        System.out.println();
        System.out.println("Sum_1 : "+SUM_1);
        System.out.println("Sum_2 : "+SUM_2);
        System.out.println("RESULT : "+RESULT);
        return 0;
    }


}
