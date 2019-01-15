package calculateCircle;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius");
		int r = Integer.valueOf(bf.readLine());
		double pi = Math.PI;
		double p = 2*pi*r;
		
		double s = pi*r*r;
		System.out.println("perimeter circle = " + p);
		System.out.println("area circle = " + s);
	}

}