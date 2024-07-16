package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamPrimeNumber {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17);
		
		l.stream().filter(x ->isPrime(x)).forEach(e->System.out.println(e));
	}
	
	
	
	
	public static boolean isPrime(Integer x) {

		int count = 0;
		
		if (x==1) {
			return false;
			
		}
		
		for (int i = 2; i <= x - 1; i++) {

			if (x % i == 0) {
				count++;
			}

		}

		return count == 0;

	}
	
	
	

}
