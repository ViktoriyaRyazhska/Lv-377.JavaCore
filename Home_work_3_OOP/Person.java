package Home_work_3_OOP;

import java.time.LocalDate;

public class Person {

	private String name;
	private int birthYear;
	private int age;

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public Person() {

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
		this.age = LocalDate.now().getYear() - this.birthYear;
		return age;
	}

	@Override
	public String toString() {
		return "My name is " + this.name + " and my age is " + this.age();
	}

}
