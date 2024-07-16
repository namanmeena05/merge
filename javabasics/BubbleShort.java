package com.javabasics;

public class BubbleShort {
	public static void main(String[] args) {

		int[] a = { 20,34,15,20,10 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] < a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
				if (temp < a[j] && a[j] < a[j - 1]) {
					temp = a[j];
					
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");

		}
		System.out.println("second highest  "+ temp);
		
		
		/*int[] a = { 20,34,15,26,10 };
		int temp = 0;int c =0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length ; j++) {
				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			
				
			}

			System.out.print(a[i]+" ");
			
			
		}
		System.out.println();
		*/
		
			

		

	}

}
