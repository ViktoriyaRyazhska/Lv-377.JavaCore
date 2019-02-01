package Lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HW2 {

	public static void main(String[] args) throws NonDiapasonException   {
		
		Integer [] digits = new Integer[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<10; i++) {
			System.out.println("Enter number "+(i+1));
			try {
				digits[i]=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("You must enter only integers numbers");
			//	e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Not found!");
				e.printStackTrace();
			}
			if((digits[i]<100)&&(digits[i]>0)) {
				System.out.println(Arrays.toString(digits));
			} else throw new NonDiapasonException("This number is not in diapason 0-100");
			
		}
		

	}

}

//Write a method readNumber(int start, int end), that read from console 
//integer number and return it, if it is in the range [start...end]. 
//If an invalid number or non-number text is read, 
//the method should throw an exception. 
//Using this method write a method main(), that has to enter 10 numbers:
//	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100

