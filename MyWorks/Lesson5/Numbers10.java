package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers10 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int numbers = 0;
		int sum = 0;
		int prod = 1;
		int i;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 10 numbers:");
		for (i = 0; i < 10; i++) {
			
			numbers = Integer.parseInt(br.readLine());
			if (i < 5) {
				sum += numbers;
			if(numbers<0) {
				
				break;
			}	
			}
			
			if (i >= 5) {prod = prod * numbers;}
		}
		System.out.println("Product " + prod);
		System.out.println("Suma " + sum);
	}
}

//Enter 10 integer numbers. 
//Calculate the sum of first 5 elements if they are positive or 
//product of last 5 element in the other case.