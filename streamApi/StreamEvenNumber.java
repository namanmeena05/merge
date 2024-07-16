package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamEvenNumber {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7);
		
		l.stream().filter(i -> i % 2 ==0).forEach(e->System.out.println(e));
	}

}
