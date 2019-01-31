package ExceptionHomeWork;

import java.io.BufferedReader;
import java.io.IOException;

public class ExceptionHomeWork {

	public static double divDouble(double a, double b) throws MyException {
		if (a == -0)
			throw new MyException("It is not correct, '0' - positive number");
		if (b == 0)
			throw new MyException("Div by zero!");

		return a / b;
	}

	public static int readNumber(int start, int end, BufferedReader br) throws MyException {

		System.out.println("Input number");

		int read = -1;
		try {
			read = Integer.parseInt(br.readLine());

		} catch (NumberFormatException | IOException e) {
			System.out.println("Invalid number or non-number, text is read");
			return -1;
		}

		if (read < start || read > end)
			throw new MyException("Number isn't in the range");

		return read;

	}

}
