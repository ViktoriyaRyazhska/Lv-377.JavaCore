package Home_work_10_Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskFile {

	public static void main(String[] args) throws FileNotFoundException {

		// Create file1.txt file with a text about your career.
		// Read context from file into array of strings. Each array item contains one
		// line from file. Write in to the file2.txt
		// 1) number of lines in file1.txt.
		// 2) the longest line in file1.txt.
		// 3) your name and birthday date.

		File file1 = new File("file1.txt");
		BufferedReader info = new BufferedReader(new FileReader(file1));

		String[] lines = new String[3];

		int count = 0;
		String str = null;

		try {
			while ((str = info.readLine()) != null) {
				lines[count] = str;
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		int max = lines[0].length();
		String longestLine = null;

		for (int i = 0; i < lines.length; i++) {
			if (lines[i].length() >= max) {
				max = lines[i].length();
				longestLine = lines[i];
			}
		}

		String name = null;
		String birthday = null;

		for (int i = 0; i < lines.length; i++) {
			if (lines[i].contains("name")) {
				name = lines[i];
			} else if (lines[i].contains("birthday")) {
				birthday = lines[i];
			}
		}

		File file2 = new File("file2.txt");
		try {
			BufferedWriter writtenInfo = new BufferedWriter(new FileWriter(file2));
			System.out.println("Write info in " + file2 + "\n");
			writtenInfo.write("Number of lines: " + count + "\n");
			writtenInfo.write("The longest line: " + longestLine + "\n");
			writtenInfo.write("Name: " + name + "\nBirthday date: " + birthday + "\n");
			writtenInfo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
