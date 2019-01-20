package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flower {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Pleas input Radius ");
		double r = Integer.parseInt(br.readLine());
		System.out.printf("For your R("+r+"): area flower bed ="+(double)(r*r*3.14)+
						  " and perimeter flower bed ="+(double)(2*r*3.14));
	}

}



