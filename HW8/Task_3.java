package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		float[] n = new float[3];
		
		System.out.println("Pls write sum in US (example $123.45: ");
		for (int i = 0; i < n.length; i++) {
			n[i] = Float.parseFloat(br.readLine());
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.printf("\n$%.2f", n[i]);
		}
		
	}
}