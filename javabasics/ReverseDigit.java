package com.javabasics;

public class ReverseDigit {

	public static void main(String[] args) {
		int n = 123 ,rev=0 ,rem=0;
		while(n>0) {
			rem=n%10;
			System.out.println("Remainder"+rem);
			rev=rem+rev*10;
			System.out.println("Reverse is"+rev);
			n=n/10;
		}
		System.out.println("final reverse is"+rev);
	}
}
