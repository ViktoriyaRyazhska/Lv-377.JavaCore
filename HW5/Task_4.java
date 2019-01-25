package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Car[] car = {
				new Car("Jo", 200),
				new Car("Lu", 300),
				new Car("Re", 500),
				new Car("Ko", 150),
				new Car("Hi", 100)
		};
			
		for (int i = 0; i < car.length; i++) {
			System.out.println("Write year of " + (i + 1) + " car: ");
			car[i].setYear(Integer.parseInt(br.readLine()));
		}
		
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
		
		Car tmp = new Car();
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear() > car[j].getYear()) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("List of cars after sorting:");
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
	}
}