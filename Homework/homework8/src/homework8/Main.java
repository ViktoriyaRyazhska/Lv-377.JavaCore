package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("First number : ");
//		int a = Integer.parseInt(br.readLine());		
//		System.out.println("Second number : ");
//		int b = Integer.parseInt(br.readLine());
//		if((a > 10 && a < 100) && (b > 10 && b < 100))	{
//			Div div = new Div();	
//		System.out.println(div.div(a, b));
//		}else {
//			throw new ArithmeticException();
//		}
		List<Integer> nambers = new ArrayList<Integer>();
		int s = 1;
		int e = 100;
	    int x = 1;
	    int y = 0;
		ReadNumber readNumber = new ReadNumber();
		for(int i = 0; i < 10; i++) {
			y = readNumber.readNumber(s, e);
			if(y > x) {
				System.out.println(x);
				x = y;				
			}else {
				System.err.println("Input mo number" + x);
			}
			nambers.add(y);
		}
		System.out.println(nambers);
	}

}
