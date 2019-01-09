package Sadovyi_HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sadovyi_HW1_3 {

			public static void main(String[] args) throws Exception, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter data");
			System.out.println("C1=");
			int C1 = Integer.parseInt(br.readLine());
			System.out.println("C2=");
			int C2 = Integer.parseInt(br.readLine());
			System.out.println("C3=");
			int C3 = Integer.parseInt(br.readLine());
			System.out.println("t1=");
			int t1 = Integer.parseInt(br.readLine());
			System.out.println("t2=");
			int t2 = Integer.parseInt(br.readLine());
			System.out.println("t3=");
			int t3 = Integer.parseInt(br.readLine());
			System.out.println("All phone calls- " + ((C1*t1)+(C2*t2)+(C3*t3)));
			System.out.println("Country 1- " + C1*t1);
			System.out.println("Country 2- " + C2*t2);
			System.out.println("Country 3- " + C3*t3);
	}

}
