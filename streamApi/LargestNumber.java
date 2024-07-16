package com.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,55,5,777,66);
		
		Integer in=l.stream().max(Integer::compare).get();
		System.out.println(in);
		
		
		
		
		//Another ways 
		
		//l.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(s->System.out.println(s));
		
	}
}
