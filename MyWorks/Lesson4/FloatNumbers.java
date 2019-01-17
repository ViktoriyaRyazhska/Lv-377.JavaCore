package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloatNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {

		float x = -5, y = 5;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first number (a): ");
		float a = Float.parseFloat(br.readLine());
		System.out.println("Enter the second number (b): ");
		float b = Float.parseFloat(br.readLine());
		System.out.println("Enter the third number (c): ");
		float c = Float.parseFloat(br.readLine());

		if ((x < a) && (y > a) && (x < b) && (y > b) && (x < c) && (y > c)) {
			System.out.println("a,b,c are belong to the range [-5,5]");
		} else
			System.out.println("one of the numbers does not belong to the range [-5,5]!");

	}

}
