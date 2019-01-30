package Home_work_5_Arrays;

public class Car {

	// Create class Car with fields type, year of production and engine capacity.
	// Create and initialize four instances of class Car. Display cars
	// certain model year (enter year in the console);
	// ordered by the field year.

	String type;
	int yearOfProduction;
	double engineCapacity;

	public Car(String type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car type = " + type + ", yearOfProduction = " + yearOfProduction + ", engineCapacity = "
				+ engineCapacity;
	}

}
