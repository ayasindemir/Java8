package org.ysn.dmr.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTestConsumer {

	public static void main(String[] args) {

		Consumer<String> con1 = (a) -> System.out.println("Input is : " + a);
		con1.accept("My Consumer");

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		Consumer<List<Integer>> con2 = (l) -> {
			for (Integer i : l) {
				System.out.print(i);
			}
			System.out.println();
		};
		con2.accept(list1);
	}

}
