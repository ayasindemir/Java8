package org.ysn.dmr.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class LambdaTestFunction {

	public static void main(String[] args) {

		Function<Integer, Integer> multiplyBy3 = (a) -> a * 3;
		int x = 6;
		System.out.println("multiplyBy3 function (input=" + x + ") : " + multiplyBy3.apply(6));

		String str = "function test";
		Function<String, String> toUpperCase = (input) -> input.toUpperCase();
		System.out.println(str + " -> " + toUpperCase.apply(str));

		IntFunction<Integer> cube = (a) -> a * a * a;
		System.out.println("Cube of " + x + " : " + cube.apply(x));

		BiFunction<String, String, Integer> maxLengthFinder = (a, b) -> {
			return a.length() > b.length() ? Integer.valueOf(a.length()) : b.length();
		};

		String str1 = "abc", str2 = "abcdef";
		System.out.println(
				"String 1 = " + str1 + ", String 2 = " + str2 + ", max length: " + maxLengthFinder.apply(str1, str2));

	}

}
