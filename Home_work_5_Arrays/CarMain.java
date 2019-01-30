package Home_work_5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CarMain {

	// Create class Car with fields type, year of production and engine capacity.
	// Create and initialize four instances of class Car. Display cars
	// certain model year (enter year in the console);
	// ordered by the field year.

	public static void main(String[] args) {

		Car[] cars = { new Car("Sedan", 2017, 2.0), new Car("Truck", 2016, 3.0), new Car("Crossover", 2018, 3.2),
				new Car("Coupe", 2014, 2.2) };

		System.out.println("Please, enter a car year.");
		Scanner sc = new Scanner(System.in);
		int enteredCarYear = sc.nextInt();

		for (int i = 0; i < cars.length; i++) {
			if (enteredCarYear == cars[i].getYearOfProduction()) {
				System.out.println(cars[i].getType());
			}
		}

		Car temporaryValue;
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYearOfProduction() > cars[j].getYearOfProduction()) {
					temporaryValue = cars[i];
					cars[i] = cars[j];
					cars[j] = temporaryValue;
				}
			}
		}
			System.out.println(Arrays.toString(cars));
		sc.close();
	}

}
