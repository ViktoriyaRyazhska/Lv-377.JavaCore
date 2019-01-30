package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Pls write some text: ");
		String s = (br.readLine()).trim();
		
		s = s.replace("  ", " ");
		
		System.out.println(s);
	}
}