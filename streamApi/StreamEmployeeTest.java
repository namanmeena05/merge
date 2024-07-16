package com.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeTest {
	public static void main(String[] args) {
		List<StreamEmployee> l = new ArrayList<StreamEmployee>();
		
		l.add(new StreamEmployee("Sourabh", 15));
		l.add(new StreamEmployee("RAj", 16));
		l.add(new StreamEmployee("ashu", 20));
		l.add(new StreamEmployee("naman", 18));
		l.add(new StreamEmployee("yash", 19));
		
		
		l.stream().filter(i->i.age>=18).collect(Collectors.toList()).forEach(s->System.out.println(s));

	}

}
