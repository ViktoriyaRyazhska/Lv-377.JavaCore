package Chellange;

import java.util.Scanner;

public class Task5smile {
	public static void palindrome(Scanner sc) {

		String world = sc.nextLine();

		if (!((world.length() % 2) == 0)) {
			System.out.println("Word: " + world + " isn't palindrome");
		} else {
			world.toUpperCase();
			String world1 = world.toUpperCase().substring(0, world.length() / 2);
			String world2 = world.toUpperCase().substring(world.length() / 2, world.length());
			String reverse = "";
			for (int i = world2.length() - 1; i >= 0; i--) {
				reverse = reverse + world2.charAt(i);
			}
			if (world1.equals(reverse)) {
				System.out.println("Word: " + world + " is palindrome");
			}
		}
	}
}
