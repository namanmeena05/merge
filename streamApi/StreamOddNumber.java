package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOddNumber {
public static void main(String[] args) {
	

	int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	
	IntStream s =   Arrays.stream(a);
	
	s.filter(e->e%2 != 0).forEach(e->System.out.print(e));
	
	
	//even number
	
	//s.filter(r->r%2==0).forEach(r->System.out.println(r));
	

}
}
