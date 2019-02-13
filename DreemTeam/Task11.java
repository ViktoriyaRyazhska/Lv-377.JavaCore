package Chellange;

import java.util.Scanner;

public class Task11 {
	public static void checkNumberCard(Scanner sc) {
		String cardNumber = sc.nextLine();
		int sum = 0;
		boolean revision = false;

		for (int i = cardNumber.length() - 1; i >= 0; i--) {
			int number = Integer.parseInt(cardNumber.substring(i, i + 1));

			if (revision) {
				number *= 2;
				if (number > 9) {
					number = (number % 10) + 1;
					System.out.println(number + " number");
				}
			}
			sum += number;
			revision = !revision;
		}
		if (sum % 10 == 0) {
			System.out.println("Credit number correct");
		} else {
			System.out.println("Credit number incorrect");
		}
	}
}