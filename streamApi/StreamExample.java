package com.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("one","two","three","four","five","six","five");
		
		//list.stream().forEach(s->System.out.print(s));
		
		
		//list.stream().sorted().forEach(s->System.out.print(s));

		//list.stream().filter(e-> e.startsWith("f")).forEach(s->System.out.println(s));
		
		//list.stream().filter(e->e.startsWith("t")).map(e->e.toUpperCase()).forEach(s->System.out.println(s));
		
		list.stream().filter(e->e.startsWith("f")).sorted().distinct().forEach(s->System.out.println(s));
		

	}
}
