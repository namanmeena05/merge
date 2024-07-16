package com.streamApi;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {

	public static void main(String[] args) {

		String[] a1 = { "ram", "shyam", "sita", "geeta" };

		Stream<String> s1 = Arrays.stream(a1);

		s1.forEach(s -> System.out.println(s));

	}
}
