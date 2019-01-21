package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int[] mont = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of month: ");
		int number = Integer.parseInt(br.readLine());

		for (int i = 0; i < mont.length; i++) {

			if ((number - 1) == i) {
				System.out.println("This month has "+mont[i]+" days" );

			}

		}

	}

}