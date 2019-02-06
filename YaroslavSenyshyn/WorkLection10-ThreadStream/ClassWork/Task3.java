package ThreadStreams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task3 {
	
	public static ArrayList<String> saveLine(File fileIn, Scanner sc) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		Stream<String> lines = Files.lines(fileIn.toPath());
		int quantity = (int) lines.count();
		for (int i = 0; i < quantity; i++) {
			array.add(sc.nextLine());
		}
		return array;
	}
	
	public static void infoMinMaxLine(ArrayList<String> array) {
		TreeSet<Integer> sizeLine = new TreeSet<Integer>();
		for (int i = 0; i < array.size(); i++) {
			sizeLine.add(array.get(i).length());
		}
		System.out.println("Shortest line: " + sizeLine.first() +" symbols");
		System.out.println("Longest line: " + sizeLine.last() +" symbols");
	}
	
	public static void findAndPrintVar(ArrayList<String> array) {
		Pattern p = Pattern.compile("var");
		for (String string : array) {
			Matcher m = p.matcher(string);
			if (m.find()) {
				System.out.println(string);
			}
		}
	}
	

}
