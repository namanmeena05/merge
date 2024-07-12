package com.exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(1);
		s.add("2");
		s.add(null);
		s.add("a");
		System.out.println(s);
	}

}
