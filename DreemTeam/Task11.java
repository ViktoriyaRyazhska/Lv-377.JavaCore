package Chellange;

import java.util.Scanner;

public class Task11 {
	public static void checkNumberCard(Scanner sc) {
		String cardNumber = sc.nextLine();
		int sum = 0;
		boolean revision = false;
		String systemCard = "";
		int systemCardQ = 0;
		if (cardNumber.length() == 16 || cardNumber.length() == 12) {

			for (int i = cardNumber.length() - 1; i >= 0; i--) {
				int number = Integer.parseInt(cardNumber.substring(i, i + 1));

				if (i == 1) {
					systemCard = (cardNumber.substring(i, i + 1));
				}
				if (i == 0) {
					systemCard = systemCard.concat(cardNumber.substring(i, i + 1));
				}

				if (i == 0) {
					systemCardQ = Integer.parseInt(cardNumber.substring(i, i + 1));
					if (systemCardQ == 4) {
						System.out.println("MasterCard");
					} else if (systemCardQ == 5) {
						System.out.println("Visa");
					}
				}
				if (revision) {
					number *= 2;
					if (number > 9) {
						number = (number % 10) + 1;
					}
				}
				sum += number;
				revision = !revision;
			}
			if (systemCard.equals("73")&&cardNumber.length()==12) {
				System.out.println("American Expres");
			}
			if (sum % 10 == 0) {
				System.out.println("Credit number correct");
			} else {
				System.out.println("Credit number incorrect");
			}
		} else {
			System.out.println("Incorect quantity number");
		}
	}
}