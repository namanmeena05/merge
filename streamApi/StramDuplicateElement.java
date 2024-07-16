package com.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StramDuplicateElement {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,2,7,4,5,8,6,7,8);
		
		l.stream().filter(x->isDuplicate(x)).forEach(e->System.out.println(e));
	}

	static Set<Integer> s = new HashSet<>();

	public static boolean isDuplicate(int x) {

		if (s.add(x) == false) {
			return true;
		}
		return false;
	}

}
