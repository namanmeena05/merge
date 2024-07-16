package com.javabasics;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		
		list.forEach(li -> System.out.println(li));

	}

}
