package Chellange;

import java.util.Scanner;

public class Task5smile {
	public static void palindrome(Scanner sc) {

		String world = sc.nextLine();
		StringBuilder sb = new StringBuilder(world);
		String reversWord = sb.reverse().toString();
		int calcul = 0;

		for (int i = 0; i < world.length(); i++) {
			if (world.toUpperCase().charAt(i) == reversWord.toUpperCase().charAt(i)) {
				calcul++;
			}
		}

		if (calcul == world.length()) {
			System.out.println("Word- " + world + ": is palindrome");
		} else {
			System.out.println("Word- " + world + ": isn't palindrome");
		}
	}
}
