package com.javabasics;

public class Triangle {
	public static void main(String[] args) {

		int i, j = 0;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j < i; j++) {

				System.out.print(i);

			}

			System.out.println(j);
		}
		
		System.out.println("-----------------------------------------------------");
		int a=0;
		int b=0;
		
		for(a=1;a<=5;a++) {
			
			for(b=1;b<a;b++) {
				System.out.print(b);
			}
			System.out.println(a);
		}
		System.out.println("------------------------------------------------------");
		
		int c=0;
		int d=0;
		for (c= 1; c <=5; c++) {
			for(d=5;d>c;d--) {
				System.out.print(c);
			}
			System.out.println(d);
			
		}
		

	}
}
