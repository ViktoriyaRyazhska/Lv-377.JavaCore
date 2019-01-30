package Home_work_5_Arrays;

import java.util.Scanner;

public class IntegerNumbers {

	public static void main(String[] args) {

		// Enter 10 integer numbers.
		// Calculate the sum of first 5 elements if they are positive
		// or product of last 5 element in the other case.

		System.out.println("Please, enter 10 numbers.");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();
		int forthNumber = sc.nextInt();
		int fifthNumber = sc.nextInt();
		int sixthNumber = sc.nextInt();
		int seventhNumber = sc.nextInt();
		int eighthNumber = sc.nextInt();
		int ninethNumber = sc.nextInt();
		int tenthNumber = sc.nextInt();

		int[] numbers = { firstNumber, secondNumber, thirdNumber, forthNumber, fifthNumber, sixthNumber, seventhNumber,
				eighthNumber, ninethNumber, tenthNumber };

		int sum = 0;
		int product = 1;
		int i;

		for (i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0 && i < 5) {
				sum += numbers[i];
			} else {
				break;
			}
		}
		System.out.println(sum);

		for (i = 5; i < numbers.length; i++) {
			product *= numbers[i];
		}

		System.out.println(product);
		sc.close();

	}

}
