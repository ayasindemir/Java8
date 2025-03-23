package org.ysn.dmr.lambda;

public class LambdaTest02 {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("In Runnable.run() without lambda...");
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> System.out.println("In Runnable.run() with lambda...");

		Thread t2 = new Thread(r2);
		t2.start();
	}

}
