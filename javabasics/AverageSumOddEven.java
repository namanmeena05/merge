package com.javabasics;

public class AverageSumOddEven {
	public static void main(String[] args) {
		int n = 10, esum = 0, osum = 0, e = 0, os = 0;

		for (int i = 0; i <= n; i++) {

			if (i % 2 == 0) {
				esum = esum + i;

				e++;
			} else {

				osum = osum + i;
				os++;
			}

		}
		System.out.println("sum of even sum is " + esum);
		System.out.println("sum of odd sum is " + osum);

		System.out.println("average of even sum is " + osum /os);
		System.out.println("average of even sum is " + esum / e);

	}

}
