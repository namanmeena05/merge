package com.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamSecondHighest {
	public static void main(String[] args) {

		List l = Arrays.asList(1000, 2000, 3000, 4000, 5000);

		l.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(s -> System.out.println(s));

	}
}
