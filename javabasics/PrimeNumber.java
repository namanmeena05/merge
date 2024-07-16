package com.javabasics;

public class PrimeNumber {
	public static void main(String[] args) {

		int n = 11;
		int temp = 0;
		for (int i = 2; i <= n-1; i++) {

			if (n % i == 0) {

				temp = temp + 1;

			}
			

		}
		if (temp==0) {
			System.out.println("prime");
			
		} else {

			System.out.println("not prime");
		}

	}

}