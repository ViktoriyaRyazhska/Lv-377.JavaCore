package HW3;

public class Person {
	private String name;
	private int birthYear;
	
	public static int count = 0;
	
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
	
	public int age() {
		return (2019 - birthYear);
	}

	@Override
	public String toString() {
		return "Person [Name=" + name + ", Birthday=" + birthYear + ", Age=" + age() + "]";
	}
	
	
}