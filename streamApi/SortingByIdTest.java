package com.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByIdTest {
	public static void main(String[] args) {
		
	List<SortingById> l =  new ArrayList<SortingById>();
	
	l.add(new SortingById("Sourabh", 101));
	l.add(new SortingById("naman", 120));
	l.add(new SortingById("Ashu", 1044));
	l.add(new SortingById("Bhaskar", 1065));
	l.add(new SortingById("daksh", 105));

	l.stream().sorted(Comparator.comparingInt(SortingById::getId)).collect(Collectors.toList())
	.forEach(s->System.out.println(s));
	}

}
