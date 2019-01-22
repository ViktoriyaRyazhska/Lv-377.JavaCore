package hw5.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw5_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
			
		int dayz [] = {31,28,31,30,31,30,31,30,31,30,31,30};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Input month number ");
		byte m = Byte.parseByte(br.readLine());
		System.out.println(dayz[m-1]);
		
	}
	
}
