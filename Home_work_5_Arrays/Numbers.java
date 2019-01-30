package Home_work_5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		// Enter 5 integer numbers. Find
		// position of second positive number;
		// minimum and its position in the array.
		// Organize entering integers until the first negative number.
		// Count the product of all entered even numbers.

		Scanner sc = new Scanner(System.in);
		int n = 0;

		int[] numbers = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Please, enter a number.");

			n = Integer.parseInt(sc.nextLine());
			if (n < 0) {
				break;
			} else {
				numbers[i] = n;
			}
		}
		System.out.println(Arrays.toString(numbers));

		int count = 0;
		int min = numbers[0];
		int product = 1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				count++;
				if (count == 2) {
					System.out.println("The position in array is as usual " + i);
				}
			}

			if (numbers[i] < min) {
				min = numbers[i];
			}

			if (numbers[i] % 2 == 0) {
				product *= numbers[i];
			}

		}
		System.out.println("The min is " + min);
		System.out.println("The product of even numbers is " + product);
		sc.close();
	}
}
