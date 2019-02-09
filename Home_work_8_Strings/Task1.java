package Home_work_8_Strings;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		// Enter in the console sentence of five words.
		// display the longest word in the sentence
		// determine the number of its letters
		// bring the second word in reverse order

		System.out.println("Please, enter sentence of five words.");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		String[] word = text.split(" ");

		int count = 0;
		int max = 0;
		String longestWord = word[0];
		for (int i = 0; i < word.length; i++) {
			count = word[i].length();
			if (count > max) {
				max = count;
				longestWord = word[i];
			}
		}
		System.out.printf("%s %d%n", longestWord, max);

		String secondWord = word[1];
		StringBuffer buffer = new StringBuffer(secondWord);
		buffer.reverse();
		secondWord = buffer.toString();
		System.out.printf("%s", secondWord);

		sc.close();
	}

}
