package ThreadHome;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ThreadHomeTask4 {
	
	public static void quantityLine(ArrayList<String> array, BufferedWriter bw) throws IOException {
		Pattern p = Pattern.compile("$");
		int temp=0;
		for (String string : array) {
			Matcher m = p.matcher(string);
			if (m.find()) {
				temp++;
			}
		}
		bw.write("Quantity lines in file.txt: "+temp+"\n");
	}
		
	public static ArrayList<String> saveLine(File fileIn, Scanner sc) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		Stream<String> lines = Files.lines(fileIn.toPath());
		int quantity = (int) lines.count();
		for (int i = 0; i < quantity; i++) {
			array.add(sc.nextLine());
		}
		return array;
	}
		
	public static class LengthComparator implements Comparator<String> {	
		@Override
		public int compare(String first, String second) {
			return first.length() - second.length();
		}
	}
	
	public static void saveLongestLine (ArrayList<String> array, BufferedWriter bw) throws IOException {
		array.sort(new LengthComparator());
		bw.write("Longest Line: "+array.get(array.size()-1)+"\n");
	}
	
	public static void findAndSaveNameBirt(ArrayList<String> array, BufferedWriter bw) throws IOException {
		Pattern p = Pattern.compile("date birthday :");
		Pattern p1 = Pattern.compile("name :");
		for (String string : array) {
			Matcher m = p.matcher(string);
			Matcher m1 = p1.matcher(string);
			if (m.find() || m1.find()) {
				bw.write(string+"\n");
			}
		}
	}

	
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		File fileIn = new File("fileIn.txt");
		Scanner sc = new Scanner(fileIn);
		BufferedWriter bw = new BufferedWriter(new FileWriter("fileOut.txt"));

		ArrayList<String> array = ThreadHomeTask4.saveLine(fileIn, sc);
	
		
		ThreadHomeTask4.quantityLine(array, bw);
		ThreadHomeTask4.saveLongestLine(array, bw);
		ThreadHomeTask4.findAndSaveNameBirt(array, bw);
		
		bw.close();
		sc.close();
	}

}