package exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//Вправа1. Чи входять числа в діапазон  
		
		System.out.println("Input 3 float numbers : ");
		float x1 = Float.valueOf(bf.readLine());
		float x2 = Float.valueOf(bf.readLine());
		float x3 = Float.valueOf(bf.readLine());
		if(-5 <= x1 && x1<= 5) {
			System.out.println("Number one : " + x1 + " belong to the range [-5,5]" );
		}else {
			System.out.println("Number one : " + x1 + " dount belong to the range [-5,5]" );
		}
		if(-5 <= x2 && x2 <= 5) {
			System.out.println("Number two : " + x2 + " belong to the range [-5,5]" );
		}else {
			System.out.println("Number two : " + x2 + " dount belong to the range [-5,5]" );
		}
		if(-5 <= x3 && x3 <= 5) {
			System.out.println("Number three : " + x3 + " belong to the range [-5,5]" );
		}else {
			System.out.println("Number three : " + x3 + " dount belong to the range [-5,5]" );
		}

		//Вправа2. Пошук min і max числа
		
		System.out.println("Input 3 integer numbers : ");
		int y1 = Integer.valueOf(bf.readLine());
		int y2 = Integer.valueOf(bf.readLine());
		int y3 = Integer.valueOf(bf.readLine());
		
		 System.out.println("Max number : ");
		 if(y1 > y2 && y1 > y3) {
			 System.out.println(y1);
		 }else if(y2 > y1 && y2 > y3) {
			 System.out.println(y2);
		 }else {
			 System.out.println(y3);
		 }
		 
		 System.out.println("Min number");
		 if(y1 < y2 && y1 < y3) {
			 System.out.println(y1);
		 }else if(y2 < y1 && y2 < y3) {
			 System.out.println(y2);
		 }else {
			 System.out.println(y3);
		 }

		 //Вправа3. Exceptions
		 
		 System.out.println("Input name Exception : ");
		 String exp = bf.readLine();
		 switch (exp.toUpperCase()) {
		case "HTTP400":
			System.out.println(HTTPError.HTTP400.getHTTP());
			break;
		case "HTTP401":
			System.out.println(HTTPError.HTTP401.getHTTP());
			break;
		case "HTTP402":
			System.out.println(HTTPError.HTTP402.getHTTP());
			break;
		default:
			System.out.println("Error");
			break;
		}
	
	}

}
