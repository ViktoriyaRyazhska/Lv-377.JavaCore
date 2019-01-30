package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Pls write 5 words: ");
		String text = br.readLine();
		
		String[] s = text.split(" ");
		
		int l = 0;
		int k = 0;
		for (int i = 0; i < 5; i++) {
			if (s[i].length() > l) {
				l = s[i].length();
				k = i;
			}
		}
		
		System.out.println("The longest word: " + s[k]);
		System.out.println("It has length: " + s[k].length());
		System.out.print("The second word in reverse order: ");
		
		char[] cha = s[1].toCharArray();
		for (int i = s[1].length() - 1; i >= 0; i--) {
			System.out.print(cha[i]);
		}
		
	}	
}