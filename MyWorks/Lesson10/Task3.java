package Lesson10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) throws FileNotFoundException {
		String text = "";
		String separator = File.separator;
		File file = new File("D:" + separator + "Java developer" + separator + "SoftServe" + separator + "src"
				+ separator + "Lesson10" + separator + "myText.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		ArrayList<String> arr = new ArrayList<String>();
		try {
			while ((text = br.readLine()) != null) {

				arr.add(text);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).contains("they"))
				System.out.println(arr.get(i));
		}
		System.out.println();

		for (int i = 0; i < arr.size(); i++) {
			System.out.println("The count of word in " + i + " line is " + arr.get(i).length());
		}
		

		int max = arr.get(0).length();
		int imax = 0;
		int i = 0;
		while (i < arr.size()) {
			if (arr.get(i).length() > max) {
				max = arr.get(i).length();
				imax = i;
				
			}
			i++;
			
		}
		System.out.println();
		System.out.print("Maximum = " + max);
		
		
		

	}

}

// Prepare mytext.txt file with a lot of text inside.
// Read context from file into array of strings.
// Each array item contains one line from file.
// Complete next tasks:
// 1) count and write the number of symbols in every line.
// 2) find the longest and the shortest line.
// 3) find and write only that lines, which consist of word «var»
