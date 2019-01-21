package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {

	private String type;
	private int year; 
	private double capacity;
	

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


	public double getCapacity() {
		return capacity;
	}


	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", capacity=" + capacity + "]";
	}


	public Car(String type, int year, double capacity) {
		super();
		this.type = type;
		this.year = year;
		this.capacity = capacity;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[]car= { new Car("audi", 2011, 3.2),
					new Car("bmw", 2011, 3.5),
					new Car("mercedes", 2013, 2.7),
					new Car("opel", 2014, 2.0)
		};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter product year: ");
		int year = Integer.parseInt(br.readLine());
		
		int i = 0;
		while (i < car.length) {
			if (car[i].getYear() == year) {
				System.out.println(car[i]);
			}
			i++;
		}
		
		//--------------------------------------------------//
		System.out.println();
		System.out.println("Sorting by product year:");

		Car tmp;
		for (int t = 0; t < car.length - 1; t++) {
			for (int j = t + 1; j < car.length; j++) {
				if (car[t].getYear() < car[j].getYear()) {
					tmp = car[t];
					car[t] = car[j];
					car[j] = tmp;

				}
			}
		}

		for (int t = 0; t < car.length; t++) {
			System.out.println(car[t]);
		}
		

	}

}