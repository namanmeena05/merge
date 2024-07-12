package com.javabasic;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int s = r.nextInt(10);
			System.out.println(s);

		}

	}

}
