package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		String fileName1 = "E:\\Temp\\file1.txt";
		String fileName2 = "E:\\Temp\\file2.txt";
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			
			String s = null;
			int count = 0;
			int max = 0;
			fr = new FileReader(fileName1);
			br = new BufferedReader(fr);
			String s1 = null;
			while ((s = br.readLine()) != null) {
				System.out.println("row :" + ++count + "read :" + s + "   " + s.length());
				
				if(s.length() > max) {
					max = s.length();
				}
				if(s.length() == max) {
				 s1 = s;
			}
			}
			System.out.println("number of rows in file1 = " + count + "\n" + "the longest line in file1.txt. : " + max + " " + s1);
				String text = "number of rows in file1 = " + count + "\n" + " the longest line in file1.txt. : " + max + " " + s1;

			
			
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
//			while ((s = br.readLine()) != null) {
//
//			}
			bw.write(text);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
