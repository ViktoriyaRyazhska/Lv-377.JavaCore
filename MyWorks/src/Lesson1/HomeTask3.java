package Lesson1;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

public class HomeTask3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Etnter phone tariff from country 1");
		double c1 = Double.parseDouble(br.readLine());
		System.out.println("Etnter call time from country 1");
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("The cost of a call 1 is " + (c1*t1) );
		System.out.println();
		
		System.out.println("Etnter phone tariff from country 2");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("Etnter call time from country 2");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("The cost of a call 2 is " + (c2*t2) );
		System.out.println();
		
		System.out.println("Etnter phone tariff from country 3");
		double c3 = Double.parseDouble(br.readLine());
		System.out.println("Etnter call time from country 3");
		double t3 = Double.parseDouble(br.readLine());
		System.out.println("The cost of a call 3 is " + (c3*t3) );
		System.out.println();
		
		System.out.println("The cost of all calls is " + ((c1*t1)+(c2*t2)+(c3*t3)) );
		

	}
}
