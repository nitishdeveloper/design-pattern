package com.array.sortsearch;

import java.util.Arrays;
import java.util.Stack;


class Pair{
	public  int x = 0;
	public  int y = 0;
	
	
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
}

public class QuickSort {

	public static void main(String[] args) {
		int a[] = { 6, 3, 4, 1, 7, 5, 2 };
		quickSortIterative(a , 0 , a.length-1);

		// print the sorted array
		System.out.println(Arrays.toString(a));
	}
	
	public static void quickSort(int A[] , int low , int high) {
		
		if(low < high) {
		
		int pivot = partition(A , low, high);
		quickSort(A , low , pivot-1);
		quickSort(A , pivot+1 , high);
		
		}
	}
	
	public static void quickSortIterative(int A[] , int s , int e) {
		Stack<Pair> stack = new Stack<Pair>();
		
		stack.push(new Pair(s, e));
		
		while(!stack.empty()) {
			s = stack.peek().getX();
			e = stack.peek().getY();
			stack.pop();
			int pivot = partition(A , s, e);
			
			if(pivot-1 > s) {
				stack.push(new Pair(s , pivot-1));
			}
			if(pivot+1 < e) {
				stack.push(new Pair(pivot+1 , e));
			}
		}
		
		
		
	}
	
	public static int partition(int A[] ,int start, int end ) {
		
		int pivot = A[end];
		int prev = start;
		
		for (int i = start; i < end; i++) {
			if(A[i] < pivot) {
				swap(A , i , prev);
				prev++;
			}
		}
		swap(A, prev , end);
		return prev;
	}
	public static void swap(int A[] ,int first, int second) {
		int temp = A[first];
		A[first] = A[second];
		A[second] = temp;
	}

}
