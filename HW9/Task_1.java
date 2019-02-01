package HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
	public static void main(String[] args) {
		div();
	}
	
	private static void div() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Write a: ");
			double a = Double.parseDouble(br.readLine());
			System.out.println("Write b: ");
			double b = Double.parseDouble(br.readLine());
			System.out.println("Result: " + (a/b));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			System.err.println(-1);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.err.println(-2);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(-3);
		}	
	}
}