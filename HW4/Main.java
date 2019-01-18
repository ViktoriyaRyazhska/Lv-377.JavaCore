package hw4.softserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter float number 1 ");
		float a = Float.parseFloat(br.readLine());
		
		System.out.println("Enter float number 2 ");
		float b = Float.parseFloat(br.readLine());
		
		System.out.println("Enter float number 3 ");
		float c = Float.parseFloat(br.readLine());
		
		//можна було перевіряти по кожному числу, але умови задачі я виконав)
		
		if (a <= 5 && a >= -5 && b<= 5 && b >= -5 && c <= 5 && c >= -5){
			System.out.println("All numbers are belong -5 to 5 range.");

		}
		else {
			System.out.println("Not all numbers are belong -5 to 5 range.");
		}
		
		//check max and min
		System.out.println("Enter integer number 1 ");
		int a1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter integer number 2 ");
		int b1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter integer number 3 ");
		int c1 = Integer.parseInt(br.readLine());
		
		if (a1 > b1 && a1 >c1){
			System.out.println("First number is max");
		}else if(b1 > a1 && b1 > c1){
			System.out.println("Second number is max");
		}else if(a1 == b1 && a1 == c1){
			System.out.println("All numbers same");
		}else if(a1 == b1 || b1 == c1){	
			System.out.println("Another two numbers is same");
		}else{
			System.out.println("Third number is max");
		}
		
		if (a1 < b1 && a1 < c1){
			System.out.println("First number is min");
		}else if(b1 < a1 && b1 < c1){
			System.out.println("Second number is min");
		}else if(c1 < a1 && c1 < b1){
			System.out.println("Third number is min");
		}	
	
	
	//HTTP errors..
	System.out.println("Input error code: ");
	 String exp = br.readLine();
	 switch (exp.toUpperCase()) {
	case "HTTP400":
		System.out.println(Error.HTTP400.getError());
		break;
	case "HTTP401":
		System.out.println(Error.HTTP401.getError());
		break;
	case "HTTP402":
		System.out.println(Error.HTTP402.getError());
		break;
	default:
		System.out.println("Wrong error code");
		break;
}
	}
}