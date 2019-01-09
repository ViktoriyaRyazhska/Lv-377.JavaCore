package hz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Radius {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Input radius");
		double r = Double.parseDouble(br.readLine());
		System.out.println("Perimeter=" + 3.14*(2*r));
		System.out.println("Area=" + 3.14*(r*r));

	}

}
