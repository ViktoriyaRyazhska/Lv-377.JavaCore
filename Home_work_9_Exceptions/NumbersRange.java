package Home_work_9_Exceptions;

import java.util.Scanner;

public class NumbersRange {

	public static int readNumber(int a) throws Exception {
		if (a <= 1 || a >= 100) {
			throw new Exception("The number isn't in range.");
		}
		return a;
	}

	public static void main(String[] args) throws Exception {

		// Write a method readNumber(int start, int end),
		// that read from console integer number and return it,
		// if it is in the range [start...end].
		// If an invalid number or non-number text is read,
		// the method should throw an exception.

		System.out.println("Please, enter a numbers.");
		Scanner sc = new Scanner(System.in);

		int enteredNumber = 0;

		try {
			enteredNumber = sc.nextInt();
		} catch (Exception e) {
			System.out.println("It's a string value.");

		}

		try {
			readNumber(enteredNumber);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

		System.out.println("Hello");

	}

}
