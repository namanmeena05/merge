package com.javabasics;

public class FunctionallTest {

	public static void main(String[] args) {

		Functionall f = new Functionall() {

			public int sum(int a, int b) {

				return a + b;
			}
		};
		int a = 20;
		int b = 10;

		System.out.println(f.sum(a, b));
		Functionall.multi(a, b);
		f.sub(a, b);
		
	}
}
