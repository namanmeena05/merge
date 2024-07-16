package com.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ContestentTest {

	public static void main(String[] args) {
		
		List<Contestent> l = new ArrayList<Contestent>();
		
		l.add(new Contestent("sourabh", 9900));
		l.add(new Contestent("sumit", 9555));
		l.add(new Contestent("ashu", 9430));
		l.add(new Contestent("naman", 9600));
		l.add(new Contestent("sachin", 9130));
		l.add(new Contestent("dheeraj", 9980));

		
		l.stream().map(e->e.phone).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e->{
			Collections.shuffle(e); return e.stream();}))
		.limit(3).forEach(s-> System.out.println(s));
		
		
	}
}
