package area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {
	public int squareRectangle(int a, int b) throws NumberFormatException, IOException, ArithmeticException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1");
			a = Integer.parseInt(br.readLine());
			System.out.println("2");
			b = Integer.parseInt(br.readLine());
		 
		if (a < 0 || b < 0) {
			throw new ArithmeticException(); 
		}
		return a*b;
				
	}

}
