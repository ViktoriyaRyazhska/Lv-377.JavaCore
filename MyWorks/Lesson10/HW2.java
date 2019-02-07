package Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2 {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String s[]) throws IOException {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (first) {
					Thread.yield();
					synchronized (second) {
						System.out.println("Success!");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (second) {
					Thread.yield();
					synchronized (first) {
						System.out.println("Success!");
					}
				}
			}
		};
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println();
		System.out.println("If you want to resolve this problem, you must to push any key!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String end = br.readLine();
		if (end != null) {

			t1.interrupt();
			t2.interrupt();

		}
	}
}
