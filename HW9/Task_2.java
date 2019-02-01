package HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
	public static void main(String[] args) {
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			try {
				a[i] = readNumber(1, 100);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	static int readNumber(int start, int end) throws ArithmeticException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = 0;
		try {
			x = Integer.parseInt(br.readLine());
			if (x > end || x < start) {
				throw new ArithmeticException();
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		return x;
	}
}