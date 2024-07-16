package com.javabasics;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int prev=0,curr=1,temp=0;
		
		while(temp<=10){
			temp=prev+curr;
			prev=curr;
			curr=temp;
			System.out.print(temp+" ");

		}
	}
}
