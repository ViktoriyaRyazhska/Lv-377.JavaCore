package Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first number: ");
		double a = Double.parseDouble(br.readLine());
		System.out.println("Enter the second number: ");
		double b = Double.parseDouble(br.readLine());

		if (b != 0) {
			double result = a / b;
			System.out.println("The result of division is " + result);

		} else
			throw new ArithmeticException("You can not divide by zero!");

	}

}

// Create method div(), which calculates
// the dividing of two double numbers.
// In main method input 2 double numbers and call this method.
// Catch all exceptions.
