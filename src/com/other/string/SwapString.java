package com.other.string;

public class SwapString {

	public static void main(String[] args) {
		swap("Nitish","Prajapati");
	}
	
	public static void swap(String str1 , String str2) {
/*		 str1 = str1+str2;
		 System.out.println("Before : "+str1);
		 str2 = str1.substring(0, str1.length()-str2.length());
		 str1 = str1.substring(str2.length());
		 str1 = str1+str2;
		 System.out.println("After : "+str1);
		 
*/		 
		 str1 = str1+","+str2;
		 str2 = str1.split(",")[0];
		 str1 = str1.split(",")[1];
		 
		 System.out.println("str2 : "+str2+" str1 : "+str1);
	}
}
