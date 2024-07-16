package com.javabasics;

public class Pallindrome {
	public static void main(String[] args) {

		int n = 121, rev = 0, rem = 0, org = n;
		while (n > 0) {

			rem = n % 10;

			rev = rem + rev * 10;

			n = n / 10;

		}
		if (rev == org) {
			System.out.println("pallindrome");

		} else {
			System.out.println("not pallindrome");

		}
	}

}
