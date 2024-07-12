package com.javabasic;

public class TwoDArray {
	public static void main(String[] args) {
		
		int[][] num = new int[10][10];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				num[i][j]=(i+1)*(j+1);
				System.out.print(num[i][j]+" \t");
			}
			System.out.println("");
		}
	}

}
