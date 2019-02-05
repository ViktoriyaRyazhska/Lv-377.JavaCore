package hw8.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw83 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		float[] n = new float[4];
		
		System.out.println("Type 4 float nums: ");
		for (int i = 0; i < n.length; i++) {
			n[i] = Float.parseFloat(br.readLine());
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.printf("\n$%.2f", n[i]);
}

	}

}
