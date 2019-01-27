import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Car car1 = new Car("Hatchback", 1999, 1.6);
		Car car2 = new Car("Sedan", 2019, 1.9);
		Car car3 = new Car("Crossover", 1989, 2.0);
		Car car4 = new Car("Coupe", 2008, 2.4);
	    System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car3.toString());
		System.out.println(car4.toString());
		System.out.print("Input car year ");
		int years=in.nextInt();
		Car [] car= {new Car("Hatchback", 1999, 1.6),
				new Car("Sedan", 2019, 1.9),
				new Car("Crossover", 1989, 2.0),
				new Car("Coupe", 2008, 2.4)};
		Car.year(years, car);
		System.out.println();
		Car.sort(car);
		}
		
	}


