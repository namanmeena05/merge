package com.javabasic;

public class Palindrome {
	public static void main(String[] args) {
		int num1 = 121;
		int sum = 0;
		int r = 0;
		int num=num1;
		
		while (num != 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		System.out.println(sum);
		if(num1==sum) {
			System.out.println("p");
		}else {
			System.out.println("N");
		}
	}

}
