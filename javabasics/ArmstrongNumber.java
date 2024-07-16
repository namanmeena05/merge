package com.javabasics;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int n = 153,r=0,sum=0,p=n;
		
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);	

			n=n/10;
		}
		if(sum==p) {
			System.out.println(sum+" it is armstrong number");
		}else {
			
			System.out.println("it is not armstrong number");
		}
	}

}
