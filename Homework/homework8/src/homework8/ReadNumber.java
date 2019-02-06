package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadNumber {
	public int readNumber(int start, int end) throws IOException,  ArithmeticException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number");
		
		int x = Integer.parseInt(br.readLine());
		if(x > start && x < end) {
			return x;
				
			
		}else {
			System.out.println("Number shoud be double number or");
			throw new ArithmeticException();
			
		}
	
	}

}
