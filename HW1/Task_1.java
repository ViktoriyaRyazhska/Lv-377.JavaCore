package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double pi = 3.14159;
		double C;
		double S;
		
		System.out.println("Entering the radius (R):");
		int R = Integer.parseInt(br.readLine());
		
		C = 2 * pi * R;
		S = pi * R * R;
		
		System.out.println("Perimeter of circle is " + C);
		System.out.println("Area of circle is " + S);
	}
}
