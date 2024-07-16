package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class TotalCount {

	public static void main(String[] args) {
		 
		List<Integer> l = Arrays.asList(1,2,3,4,44,33,66,32,5,6,7,8,9);
		
		long a=l.stream().count();
		System.out.println(a);
	}
}
