package practivaltasks;

import java.util.Scanner;

public class Task5 {

	public static void task5() {
		System.out.println("Please, enter any word.");
		String word = sc.nextLine();

		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		String newWord = sb.toString();

		if (word.equals(newWord)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static void main(String[] args) {

		// 5. Input string and check if this string is palindrome (e.g. “ABCCBA”)
		Task5.task5();
	}
}
