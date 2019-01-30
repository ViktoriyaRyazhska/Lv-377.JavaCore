package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHomeWork {

	public static void inputFiveWord(Scanner sc) {
		System.out.println("Pleas input sentens");
		String s = sc.nextLine();
		String[] sArray = s.split(" ");
		String temp = sArray[0];
		for (int i = 1; i < sArray.length; i++) {
			if (sArray[i].length() > temp.length()) {
				temp = sArray[i];
			}
		}

		System.out.println("longest word in sentens: " + temp);
		System.out.println("quantity letters: " + temp.length());
		temp = new StringBuffer(sArray[1]).reverse().toString();
		System.out.println("second word in reverse order: " + temp);
	}

	public static void moreSpace(Scanner sc) {
		System.out.println("Pleas sentence, between the words more than one space");
		String s = sc.nextLine();
		s = s.replaceAll("\\s+", " ");
		System.out.println(s);
	}

	public static void currencyUS(Scanner sc) {
		System.out.println("Pleas input text with US currency");
		String s = sc.nextLine();

		Pattern p = Pattern.compile("(\\$+\\d+\\.\\d{2})");
		Matcher m = p.matcher(s);

		while (m.find()) {
			System.out.println(m.group());
		}

	}
}
