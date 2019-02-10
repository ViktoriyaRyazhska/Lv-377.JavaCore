package filer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args){

		String fileName = "E:\\Temp\\test.txt";
//		FileWriter fw = null;
//		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;

//		String text = "² âðàæîþ çëîþ êðîâþ\n";
		
		try {
			
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s = null;
			int count = 0;
			int max = 0;
			int min = br.readLine().length();
//			Pattern p = Pattern.compile("6.² Äí³ïðî, ³ êðó÷³");
//			Matcher m = p.matcher(br.readLine());
//			System.out.println(br.readLine());
			System.out.println("Read from file : " + fileName);
			while ((s = br.readLine()) != null) {
				System.out.println("row :" + ++count + "read :" + s + "   " + s.length());
				if(s.length() > max) {
					max = s.length();
				}
				
				if(s.length() < min) {
					min = s.length();
				}
//				if(m.matches()) {
//					System.out.println("12121212" + s + m.group());
//				}
				
			}
			System.out.println("max row = " + max);
			System.out.println("min row = " + min);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
