package Home_work_8_Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) {

		// Enter a sentence that contains the words between more
		// than one space. Convert all spaces, consecutive, one.
		// For example, if we introduce the sentence
		// "I    am    learning     Java     Core",
		// we have to get the "I'm learning Java Core".

		System.out.println("Please, enter a sentence that contains the words between more than one space.");

		Scanner sc = new Scanner(System.in);

		String pattern = "([a-zA-Z]+)";
		String text = sc.nextLine();

		Pattern verification = Pattern.compile(pattern);
		Matcher matcher = verification.matcher(text);

		while (matcher.find()) {
			System.out.print(text.substring(matcher.start(), matcher.end()) + " ");
		}

		sc.close();
	}

}
