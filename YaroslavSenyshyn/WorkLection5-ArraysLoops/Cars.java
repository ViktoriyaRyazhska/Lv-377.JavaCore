package HomeworkArrayLoops;

import java.util.Scanner;

public class Cars {
	private String type;
	private int year;
	private int capacity;
	public static int temp;
	
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Cars(String type, int year, int capacity) {
		this.type = type;
		this.year = year;
		this.capacity = capacity;
		
		}
	
	public static void findYear(Cars cars[], int year) {
		for (int i = 0; i < cars.length; i++) {	
			if (cars[i].year == year) {
				System.out.println(cars[i]);
			}
		}
	}

	public static void sort(Cars carArray[]) {
		Cars[] c = new Cars[1];
		
		for (int i = 0; i < carArray.length-1; i++) {
			for (int j = i+1; j < carArray.length; j++) {
				if (carArray[i].getYear() > carArray[j].getYear()) {
					c[0] = carArray[i];
					carArray[i] = carArray[j];
					carArray[j] = c[0];
				}
			}
		}
	}
	
	public static void print(Cars carArray[]) {
		for (int i = 0; i < carArray.length; i++) {
			System.out.println(carArray[i]);
		}
	}
	
	@Override
	public String toString() {
		return "Cars type= " + type + ", year= " + year + ", capacity= " + capacity;
	}
	

}
