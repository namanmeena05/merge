package com.javabasics;

public class FunctionallTestLambda {
	public static void main(String[] args) {

		Functionall f = (a, b) -> {

			return (a + b);

		};
		int a = 15;
		int b = 10;
		System.out.println(f.sum(a, b));
		Functionall.multi(a, b);
		f.sub(a, b);

	}

}
