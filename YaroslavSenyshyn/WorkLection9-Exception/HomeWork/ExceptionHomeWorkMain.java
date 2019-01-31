package ExceptionHomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHomeWorkMain {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

////////Task1
	public static void main(String[] args) throws MyException {
		try {
			System.out.println(ExceptionHomeWork.divDouble(-0, 1.2));
		} catch (MyException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(ExceptionHomeWork.divDouble(5.25, 0));
		} catch (MyException e) {
			e.printStackTrace();
		}

		ExceptionHomeWork.divDouble(5.25, 2);
////////Task2

		for (int i = 0; i < 10; i++) {
			ExceptionHomeWork.readNumber(1, 100, br);
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
