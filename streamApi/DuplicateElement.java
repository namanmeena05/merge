package com.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		List l = Arrays.asList(4,7,9,2,6,3,5,7,8,9,9,8,7,65,4);
		
		Set s = new HashSet();
		
		l.stream().sorted().filter(n->!s.add(n)).forEach(x->System.out.println(x));
	}
}
