package HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1_1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double a = 0, b = 1;
		try {
			System.out.println("Write a: ");
			a = Double.parseDouble(br.readLine());
			System.out.println("Write b: ");
			b = Double.parseDouble(br.readLine());
			div(a, b);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
			System.err.println(-1);
		}
	}
	
	private static void div(double a, double b) {	
		try {
			System.out.println("Result: " + (a/b));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.err.println(-2);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(-3);
		}
	}
}