package car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Car[] cars = {new Car("jeep", 1975, 2.0), new Car("sedan", 1980, 1.5), new Car("jeep", 1980, 2.2), new Car("sport", 1990, 1.6)};
		System.out.println("input model year : ");
		int year = Integer.valueOf(bf.readLine());
		Car x = new Car();
		for(int i =0; i < cars.length; i++) {

//			for(int j = 0; j < cars.length; j++) {
//				
//				
//				if(cars[i].getYearOfProduction() < cars[j].getEngineCapacity()) {
//					x = cars[i];
//					cars[i] = cars[j];
//					cars[j] = x;
//				}
//				
//			}
//			System.out.println(cars[i]);
			
			
			
			if(year == cars[i].getYearOfProduction()) {
				System.out.println("output certain model year : " + cars[i]);
			}
			
		}
	}
}
