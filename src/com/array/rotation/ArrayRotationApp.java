package com.array.rotation;

public class ArrayRotationApp {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7};
//		rotationUsingMethod1(arr,5);
//		System.out.println(gcd(2,8));
//		jugglingRotationAlgo(arr,7,1);
//		leftRotate(arr,2);
		reversalAlgo(arr,0,arr.length-1);
		print(arr);
	}
	
	public static void rotationUsingMethod1(int a[] , int key) {
		
		int temp1[]  = new int[key];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if(i < key) {
				 temp1[i] = a[i];
			}else {
				a[index++] =  a[i];
			}
		}
	
		for (int k = 0; k < temp1.length; k++) {
			if(temp1[k]!=0) {
			  a[index] = temp1[k];
			  index++;
			}
		}
		temp1 = null;
		print(a);
		
	}

	public static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void rotationUsingMethod2(int a[] , int key) {
		
	}
	public static int gcd(int a , int b) {
		
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b , a%b);
		}
			
	}
	
	public static void jugglingRotationAlgo(int arr[] , int n,int k) {
		
	int i , j ,d, temp;
	int set = gcd(n,k);
	for (i = 0; i < set; i++) { 
        temp = arr[i]; 
        j = i; 
        while (true) { 
            d = (j + k)%n; 
            if (d == i)
                break; 
            arr[j] = arr[d]; 
            j = d; 
        } 
        arr[j] = temp; 
    } 
		
	}
	
	public static void reversalAlgo(int A[] , int start , int end) {
		
		int temp;
		
		while (start < end) {
			 temp = A[start];
			 A[start] = A[end];
			 A[end] =  temp;
			 start++;
			 end--;
		}
	}
	
	public static void leftRotate(int A[] , int d) {
		
		if(d == 0)
			return;
		
		int n = A.length;
		reversalAlgo(A , 0 , d-1);
		reversalAlgo(A , d , n-1);
		reversalAlgo(A , 0 , n-1);
	}
	
}