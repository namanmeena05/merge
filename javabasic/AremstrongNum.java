package com.javabasic;

public class AremstrongNum {
	public static void main(String[] args) {
		int num1 = 153;
		int r = 0;
		int sum = 0;
		int num = num1;
		while (num != 0) {
			r = num % 10;
			sum = sum + r * r * r;
			num = num / 10;
		}
		if (sum == num1) {
			System.out.println("Yes");

		} else {
			System.out.println("Not");
		}
	}

}
