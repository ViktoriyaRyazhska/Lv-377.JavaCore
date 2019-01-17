package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Digits {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int count =0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number 1: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter number 2: ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter number 3: ");
		int c = Integer.parseInt(br.readLine());
		
		if(a%2==1) {count++;}
		if(b%2==1) {count++;}
		if(c%2==1) {count++;}
		
		System.out.println("Number of odd numbers: "+count);
		

	}

}
