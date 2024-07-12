package com.javabasic;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i < 5; i++) {
			c = a + b;
			System.out.print(a + " ");
			a = b;
			b = c;

		}
	}

}
