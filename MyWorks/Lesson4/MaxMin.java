package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the first number (a): ");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number (b): ");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter the third number (c): ");
		int c = Integer.parseInt(br.readLine());

		     if ((a > b) && (a > c)) {System.out.println("A is maximum number " + a);} 
		else if ((b > a) && (b > c)) {System.out.println("B is maximum number " + b);} 
		else if ((c > a) && (c > b)) {System.out.println("C is maximum number " + c);} 
		     
		     if ((a < b) && (a < c)) {System.out.println("A is minimum number " + a);} 
		else if ((b < a) && (b < c)) {System.out.println("B is minimum number " + b);} 
		else if ((c < a) && (c < b)) {System.out.println("C is minimum number " + c);} 

	}

}


