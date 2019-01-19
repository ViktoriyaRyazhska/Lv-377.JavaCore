import java.time.Year;

public class Car {
	private CarType type;
	private Year dateOfProduction;
	private double engineCapacity;
	
	
	//------------------------Constructors--------------------------------------
	public Car() {
		super();
	}
	
	public Car(String type) {
		super();
		this.type = CarType.asCarType(type);
	}
	

	public Car(String type, String dateOfProduction) {
		super();
		this.type = CarType.asCarType(type);
		this.setDateOfProduction(dateOfProduction);
	}

	public Car(String type, String dateOfProduction, double engineCapacity) {
		super();
		this.type = CarType.asCarType(type);
		this.setDateOfProduction(dateOfProduction);
		this.engineCapacity = engineCapacity;
	}
	
	//------------------------Getters&Setters--------------------------------------

	public CarType getType() {
		return type;
	}
	public void setType(String str) {
		this.type = CarType.asCarType(str);
	}	
	public Year getDateOfProduction() {
		return dateOfProduction;
	}
	public void setDateOfProduction(String dateOfProduction) {
		this.dateOfProduction = Year.parse(dateOfProduction);
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}


	//------------------------Methods--------------------------------------
	
	@Override
	public String toString() {
		return "Car [type=" + type + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}

	
	public static void displayCars(Car[] cars) {
		System.out.println("All cars: ");
		for(Car car: cars) {
			System.out.println(car);
		}
	}
	
	public static void displayCars(Car[] cars, String year) {
		Year tempYear = Year.parse(year);
		System.out.println("Cars from year: " + tempYear);
		int count = 0;
		for (Car car : cars) {
			if (car.getDateOfProduction().equals(tempYear)) {
				System.out.println(car);
				count++;
			}
		}
		// if no matches
		if (count == 0) {
			System.out.println("no matches");
		}
	}
	
	public static Car[] carArrayBubbleSortByYearAsc (Car[] cars ) {
		Car[] tempCars = cars.clone();
		Car temp;
			for (int i = 0; i <cars.length-1; i++) {
				for (int j = i+1; j<cars.length; j++) {
					if (tempCars[i].getDateOfProduction().isAfter(tempCars[j].getDateOfProduction())) {
						temp = tempCars[i]; 
						tempCars[i] = tempCars[j]; 
						tempCars[j] = temp;
					}
				}
			}
		return tempCars;
	} 

}

//------------------------Enum--------------------------------------
enum CarType {
	A, B, C, D, E, F, G, H, K, L, M;

	public static CarType asCarType(String str) {
		for (CarType ct : CarType.values()) {
			if (ct.name().equalsIgnoreCase(str)) {
				return ct;
			}
		}
		return null;
	}
}