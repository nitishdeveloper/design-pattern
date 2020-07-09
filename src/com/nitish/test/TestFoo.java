package com.nitish.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestFoo {
	public static void main(String[] args) {
		int[] A = {1,2,3,1,3,4,4,5,1,1,5,6,9,8,8,8,8,1,2};

		 Map<Integer , Integer> map = new HashMap<>();
		 for(int i = 0 ; i < A.length; i++){
		     if(map.containsKey(A[i])){
		         map.put(A[i] , map.get(A[i])+1);
		     }else{
		          map.put(A[i] ,1);
		     }
		 }
		 TreeMap<Integer , Integer> tree = new TreeMap<>();
		 for(Entry<Integer , Integer> en : map.entrySet()){
			 	tree.put(en.getKey() , en.getValue());
		 }
		System.out.println(tree);
	}
}
