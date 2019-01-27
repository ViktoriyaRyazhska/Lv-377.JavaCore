
public class Car {
	private String type;
	private int year;
	private double engine;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public Car(String type, int year, double engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [type=" + getType() + ", year=" + getYear() + ", engine=" + getEngine() + "]";
	}

	public static void year(int years, Car[] car) {
		for (int i = 0; i < car.length; i++) {
			if (car[i].year == years) {
				System.out.println(car[i]);
			}

		}
	}

	public static void sort(Car[] car) {
		Car tmp;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].year < car[j].year) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		System.out.println("Sorting machines ");
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
			}

	}
}
