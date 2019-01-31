package Exceptions;

public class ExceptionsTask {

	public static int squareRentangle(int a, int b) throws MyExceptions {
		if (a < 0 || b < 0)
			throw new MyExceptions();
		return a * b;
	}

}
