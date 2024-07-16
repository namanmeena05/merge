package com.streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByNameTest {
	public static void main(String[] args) {
		
	List<SortingByName> l =  new ArrayList<SortingByName>();
	
	l.add(new SortingByName("daksh", 199));
	l.add(new SortingByName("harish", 166));
	l.add(new SortingByName("jay", 133));
	l.add(new SortingByName("sourabh", 155));
	l.add(new SortingByName("naman", 111));
	l.add(new SortingByName("ashu", 104));
	l.add(new SortingByName("bhaskar", 101));
	

	
	
	l.stream().sorted(Comparator.comparing(SortingByName::getName)).collect(Collectors.toList())
	.forEach(s->System.out.println(s));
	}

}
