package nambers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Namber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input nambers");
		int x1 = Integer.valueOf(br.readLine()); 
		int x2 = Integer.valueOf(br.readLine()); 
		int x3 = Integer.valueOf(br.readLine()); 
		System.out.println("Виводим непарні числа");
		if(x1%2 == 1 ) {
			System.out.println(x1);
		}
		if(x2%2 == 1 ) {
			System.out.println(x2);
		}
		if(x3%2 == 1 ) {
			System.out.println(x3);
		}
	}

}
