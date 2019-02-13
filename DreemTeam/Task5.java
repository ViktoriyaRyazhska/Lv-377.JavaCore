package practivaltasks;

import java.util.Scanner;

public class Task5 {

	static boolean isPalindrome(String enteredWord) {
		System.out.println("Please, enter any word.");
		String enteredWord = sc.nextLine();
		int wordLength = enteredWord.length();
		for (int i = 0; i < (wordLength / 2); ++i) {
			if (enteredWord.charAt(i) != enteredWord.charAt(wordLength - i - 1)) {
				return false;
			}
		} System.out.println(Task5.isPalindrome(enteredWord));
		return true;
		
	}

	public static void main(String[] args) {

		// 5. Input string and check if this string is palindrome (e.g. “ABCCBA”)
		
		System.out.println("Please, enter any word.");

		Scanner sc = new Scanner(System.in);
		//String enteredWord = sc.nextLine();

		

	}

}
