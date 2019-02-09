package Home_work_8_Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) {

		// Implement a pattern for US currency: the first symbol "$",
		// then any number of digits, dot and two digits after the dot.
		// Enter the text from the console that contains several
		// occurrences of US currency. Display all occurrences on the screen.

		System.out.println("Please, enter the text that occurrences of US currency.");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		String pattern = "\\$[1-9]+(\\.[0-9]+)?";

		Pattern verification = Pattern.compile(pattern);
		Matcher matcher = verification.matcher(text);
		
		while (matcher.find()) {
			System.out.print(text.substring(matcher.start(), matcher.end()) + " ");
		}
		
		sc.close();

	}

}
