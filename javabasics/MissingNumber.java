package com.javabasics;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3};
		
		int[] b = {1,2};
		
		int sum=0;
		int sum1=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			
		}
		
		for (int i = 0; i < b.length; i++) {
			sum1=sum1+b[i];
			
		}
		System.out.println(sum-sum1);
	}

}
