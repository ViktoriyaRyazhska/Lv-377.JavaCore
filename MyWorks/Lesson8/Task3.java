package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter name " + i + ": ");
			n1 = br.readLine();
			System.out.println(valid(n1));
		}

	}

	static boolean valid(String s) {
		String pattern = "\\w{3,15}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);
		return m.matches();
	}
}

//
// The user name can be 3 to 15 characters
// of the Latin alphabet, numbers, and underscores.
//
// Using regular expressions implement checking the user name for validity.
// Input five names in the main method .
// Output a message to the console of the validation of each of the entered
// names.
