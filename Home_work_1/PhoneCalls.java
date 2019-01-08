package Home_work_1;

import java.util.Scanner;

public class PhoneCalls {
	
//	Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units per minute. 
//	Talks continued t1, t2 and t3 minutes. 
//	How much computer will count for each call separately and all talk together? 
//	Input all source data from console, make calculations and output to the screen.


	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please, type price per minute in Ukraine");
		double priceInUkraine = sc.nextDouble();
		System.out.println("Please, type price per minute in USA");
		double priceInUSA = sc.nextDouble();
		System.out.println("Please, type price per minute in Poland");
		double priceInPoland = sc.nextDouble();
		
		System.out.println("Please, type call duration to Ukraine");
		int callDurationToUkraine = sc.nextInt();
		System.out.println("Please, type call duration to USA");
		int callDurationToUSA = sc.nextInt();
		System.out.println("Please, type call duration to Poland");
		int callDurationToPoland = sc.nextInt();
		
		double priceOfCallToUkraine = priceInUkraine * callDurationToUkraine;
		double priceOfCallToUSA = priceInUSA * callDurationToUSA;
		double priceOfCallToPoland = priceInPoland * callDurationToPoland;
		double totalCallsPrice = priceOfCallToUkraine + priceOfCallToUSA + priceOfCallToPoland;
		
		System.out.println("Price of call to Ukraine is " + priceOfCallToUkraine);
		System.out.println("Price of call to USA is " + priceOfCallToUSA);
		System.out.println("Price of call to Poland is " + priceOfCallToPoland);
		System.out.println("Total calls price is " + totalCallsPrice);
		
		sc.close();
		
	}

}
