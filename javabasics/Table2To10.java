package com.javabasics;

public class Table2To10 {
	public static void main(String[] args) {
		
	int [][] t = new int [10][9];
	
	for (int i = 0; i < t.length; i++) {
		for (int j = 0; j < t[i].length; j++) {
			
			int c = (i+1)*(j+2);
			System.out.print(c+" \t");
		}
		System.out.println(" ");
	}

	
	}

}
