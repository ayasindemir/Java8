package org.ysn.dmr.lambda;

import org.ysn.dmr.functional.FunctionalInterface01;

public class LambdaTest01 {

	public static void main(String[] args) {

		FunctionalInterface01 square1 = new FunctionalInterface01() {

			@Override
			public int calculateArea(int x, int y) {
				return x * y;
			}
		};

		int x = 5, y = 9;
		System.out.println("without lambda: " + square1.calculateArea(x, y));

		FunctionalInterface01 square2 = (a, b) -> a * b;
		System.out.println("with lambda sample 1: " + square2.calculateArea(x, y));

		FunctionalInterface01 square3 = (int a, int b) -> a * b;
		System.out.println("with lambda sample 2: " + square3.calculateArea(x, y));

		FunctionalInterface01 square4 = (int a, int b) -> {
			return a * b;
		};
		System.out.println("with lambda sample 3: " + square4.calculateArea(x, y));

	}

}
