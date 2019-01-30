package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text =br.readLine();
		Pattern p = Pattern.compile("[$]+[0-9]+[.]+[0-9]{2}");
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end())+" ");
		}
	}
}

// Implement a pattern for US currency: the first symbol "$",
// then any number of digits, dot and two digits after the dot.
// Enter the text from the console that contains several occurrences of US
// currency.
// Display all occurrences on the screen.
