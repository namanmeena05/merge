package com.javabasics;

import java.util.Arrays;

public class ParallelShort {
	public static void main(String[] args) {
		
	
	int[] n = {10,90,50,30,60,40,110};
	
	Arrays.parallelSort(n);
	
	for (int i = 0; i < n.length; i++) {
		System.out.println(n[i]);
		
	}
}
}
