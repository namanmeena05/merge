package com.javabasic;

public class ReverseDigit {
	public static void main(String[] args) {
		int num = 132334467;
		int sum = 0;
		int r = 0;
		while (num != 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;

		}
		System.out.println(sum);
	}

}
