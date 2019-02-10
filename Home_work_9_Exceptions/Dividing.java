package Home_work_9_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Dividing {

	public static double div(double a, double b) throws Exception {
		if (b == 0) {
			throw new Exception("You are dividing on zero.");
		}
		return a / b;
	}

	public static void main(String[] args) throws ArithmeticException, IOException {

		// Create method div(), which calculates the dividing of
		// two double numbers. In main method input 2 double
		// numbers and call this method. Catch all exceptions.

		System.out.println("Please, enter two double numbers.");
		Scanner sc = new Scanner(System.in);
		double firstNumber = 0;
		double secondNumber = 0;

		try {
			firstNumber = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Entered number is a string.");
		}

		try {
			secondNumber = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Entered number is a string.");
		}

		try {
			System.out.println(div(firstNumber, secondNumber));
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

		System.out.println("Hello");
		sc.close();

	}

}
