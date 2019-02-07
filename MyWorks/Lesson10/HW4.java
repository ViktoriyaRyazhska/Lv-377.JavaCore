package Lesson10;

import java.io.*;
import java.util.ArrayList;

public class HW4 {
	public static void main(String[] args) {

		String text = "";
		String myName = "Serhii 28/06";
		String separator = File.separator;
		File file1 = new File("D:" + separator + "Java developer" + separator + "SoftServe" + separator + "src"
				+ separator + "Lesson10" + separator + "file1.txt");
		File file2 = new File("D:" + separator + "Java developer" + separator + "SoftServe" + separator + "src"
				+ separator + "Lesson10" + separator + "file2.txt");
		BufferedReader inFile = null;
		BufferedWriter outFile = null;
		
		/** Read context from file1.txt */
		try {
			try {
				inFile = new BufferedReader(new FileReader(file1));
			} catch (FileNotFoundException e) {
				System.out.println("File " + file1 + " not found");
			}
			ArrayList<String> arr = new ArrayList<String>();
			try {
				while ((text = inFile.readLine()) != null) {
					arr.add(text);
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
			/** number of lines in file1.txt */
			System.out.println("Number of line in file is " + arr.size());
			System.out.println();
			/////////////

			/** the longest line in file1.txt */
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
			String maxLine = arr.get(imax);
			
			/** Write in to the file2.txt */
			try {
				outFile = new BufferedWriter(new FileWriter(file2));

				outFile.write("Max number of line " + arr.size());
				outFile.append(" " + maxLine);
				outFile.append(" " + myName);
				outFile.close();
			} catch (FileNotFoundException e) {
				System.out.println("File " + file2 + " not found!");
			}

		} catch (IOException e) {
			System.out.println("IOException: " + e.toString());
		}

	}
}

// Create file1.txt file with a text about your career.
// Read context from file into array of strings.
// Each array item contains one line from file.
// Write in to the file2.txt
// 1) number of lines in file1.txt.
// 2) the longest line in file1.txt.
// 3) your name and birthday date.
