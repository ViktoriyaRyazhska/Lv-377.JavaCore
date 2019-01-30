package Lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[5];

		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();

		}
		System.out.println(Arrays.toString(str));

		int max = 0, imax = 0;
		int k = 0;
		while (k < str.length) {
			if (str[k].length() > max) {
				max = str[k].length();
				imax = k;
			}
			k++;

		}
		System.out.println("Tne word with maximum count of chars is " + max + " this is " + str[imax]);
		StringBuilder sb = new StringBuilder(str[1]);
		System.out.println("Original word #2 " + str[1] + " his reverse word is " + sb.reverse());

	}

}

/*
 * Enter in the console sentence of five words. display the longest word in the
 * sentence determine the number of its letters bring the second word in reverse
 * order
 */
