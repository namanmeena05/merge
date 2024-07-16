package com.javabasics;

public class SecondLargestsSort {
		public static void main(String[] args) {

			int[] a = { 200, 600, 150, 160, 800, 60, 500 };
			int c = 0;
			int temp = 0;

			for (int i = 0; i < a.length; i++) {
				
				if (temp < a[i]) {
					c = temp;
					temp = a[i];
					
				}
				 if (c < a[i] && a[i] < temp) {
					c = a[i];
				}
			}

			System.out.println(c);

			System.out.println("-----------------");


	}

}
