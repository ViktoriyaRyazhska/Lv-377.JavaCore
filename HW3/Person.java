package HW3;

import java.time.LocalDate;

public class Person {
	private String name;
	private int birthYear;
	
	public static int count = 0;
	
	//public static LocalDate of(int year, int month, int dayOfMonth)
	//public static LocalDate now();
	
	public Person() {
		count++;
	}
	
	public Person(String name) {
		this.name = name;
		count++;
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
		count++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	LocalDate localDate = LocalDate.now();
	
	public int age() {
		return (localDate.getYear() - birthYear);
	}

	@Override
	public String toString() {
		return "Person [Name=" + name + ", Birthday=" + birthYear + ", Age=" + age() + "]";
	}
	
	
}