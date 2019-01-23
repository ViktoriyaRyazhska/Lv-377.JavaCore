package Lesson4_Conditions.Task3;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {

		// Enter three numbers. Find out how many of them are odd.

		int firstNumber;
		int secondNumber;
		int thirdNumber;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the first number");
		firstNumber = sc.nextInt();
		System.out.println("Please, enter the second number");
		secondNumber = sc.nextInt();
		System.out.println("Please, enter the third number");
		thirdNumber = sc.nextInt();

		int[] array = { firstNumber, secondNumber, thirdNumber };

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println("The number " + array[i] + " is an even one ");
			} else {
				System.out.println("The number " + array[i] + " is an odd one ");
				count++;
			}
		}
		System.out.println(count + " numbers are odd");
		sc.close();
	}

}
