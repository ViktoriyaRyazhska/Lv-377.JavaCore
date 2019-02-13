package Chellange;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
	public static void calculateNumberLoudLetters(Scanner sc) {
		String someText = sc.nextLine();
		int calculateLoud = 0;
		Pattern p = Pattern.compile("[AEIOUYaeiouy]");
		Matcher m = p.matcher(someText);

		while (m.find()) {
			calculateLoud++;
		}
		System.out.println("Number of words: " + (calculateLoud));
	}

}