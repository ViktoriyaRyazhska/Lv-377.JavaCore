package hw8.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw81 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Type 5 words: ");
		String text = br.readLine();
		
		String[] wrds = text.split(" ");
		
		int l = 0;
		int k = 0;
		for (int i = 0; i < 5; i++) {
			if (wrds[i].length() > l) {
				l = wrds[i].length();
				k = i;
			}
		}
		
		System.out.println("Longest word is: " + wrds[k]);
		System.out.println("It has symbols: " + wrds[k].length());
				
		StringBuilder sb = new StringBuilder(wrds[1]);
		
		System.out.println("Second word " + wrds[1] + " in reverse: " + sb.reverse());
		}
		
	}	
