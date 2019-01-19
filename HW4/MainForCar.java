import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainForCar {

	public static void main(String[] args) throws IOException {
		Car[] cars = {	new Car("k", "2009", 1.8),
						new Car("b", "2013", 1.2),
						new Car("a", "2003", .6),
						new Car("C", "2009", 2.0)
		};

		// Display all cars
		Car.displayCars(cars);
		
		// Display cars by year;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter the year formatted as yyyy:");
		String year = br.readLine(); 
		Car.displayCars(cars, year);
		
		System.out.println("Array of cars ordered by year ascending: ");
		Car.displayCars(Car.carArrayBubbleSortByYearAsc(cars));
		
	}

}
