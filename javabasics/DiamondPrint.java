package com.javabasics;

public class DiamondPrint {
	public static void main(String[] args) {
		
		for (int i = 0; i <=5; i++) {  //rows
			for (int j = 1; j <=5-i; j++) {//space
				System.out.print(" ");
				
			}
			for (int k = 1; k<=i*2-1; k++) {//star
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		for (int i = 5-1; i>0; i--) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
				
				
			}
			for (int k = 1; k <=i*2-1; k++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
