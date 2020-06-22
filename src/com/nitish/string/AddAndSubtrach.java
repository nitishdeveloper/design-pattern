package com.nitish.string;

public class AddAndSubtrach {

	public static void main(String[] args) {
		addition(5, 6);
	}

	public static void addition(int a, int b) {
		while (b != 0) {
			int carray = a & b;
			 a = a ^ b;
			b = carray << 1;
		}
		System.out.println("addition : " + a);
	}

	public static void subtraction(int a, int b) {
		while (b != 0) {
			int carray = ~a & b;
			a = a ^ b;
			b = carray << 1;
		}
		System.out.println("subtraction : " + a);
	}

	public static void multiply(int a, int b) {

		boolean isNegative = false;

		if (a < 0 && b < 0) {
			a = -a;
			b = -b;
		}
		if (a < 0 && b > 0) {
			a = -a;
			isNegative = true;
		}
		if (a > 0 && b < 0) {
			b = -b;
			isNegative = true;
		}

		int result = 0;

		while (b != 0) {

			if ((b & 1) == 1) {
				result += a;
			}
			a = a << 1; // multiply right shift
			b = b >> 1; // division left shift
		}
		System.out.println((isNegative) ? -result : result);
	}
}
