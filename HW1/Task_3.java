package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s1, s2, s3, S;
		
		System.out.println("Enter standard units per minute c1:");
		int c1 = Integer.parseInt(br.readLine());
		System.out.println("Enter time t1:");
		int t1 = Integer.parseInt(br.readLine());
		System.out.println("Enter standard units per minute c2:");
		int c2 = Integer.parseInt(br.readLine());
		System.out.println("Enter time t2:");
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("Enter standard units per minute c3:");
		int c3 = Integer.parseInt(br.readLine());
		System.out.println("Enter time t3:");
		int t3 = Integer.parseInt(br.readLine());
		
		s1 = c1 * t1;
		s2 = c2 * t2;
		s3 = c3 * t3;
		S = s1 + s2 + s3;
		
		System.out.println("Computer will count for first call " + s1 + " min.");
		System.out.println("Computer will count for second call " + s2 + " min.");
		System.out.println("Computer will count for third call " + s3 + " min.");
		System.out.println("All talk together is " + S + " min.");
	}
}
