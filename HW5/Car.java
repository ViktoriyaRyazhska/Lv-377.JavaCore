package HW5;

public class Car {
	private String type;
	private int capacity;
	private int year;
	
	public Car() {
		
	}
	
	public Car(String type) {
		this.type = type;
	}
	
	public Car(String type, int capacity) {
		this.type = type;
		this.capacity = capacity;
	}
	
	public Car(String type, int capacity, int year) {
		this.type = type;
		this.capacity = capacity;
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", capacity=" + capacity + ", year=" + year + "]";
	}
}