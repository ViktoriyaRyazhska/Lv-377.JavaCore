package Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	private String name;
	private static int birthYear;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getBirthYear() {
		return birthYear;
	}

	public static void setBirthYear(int birthYear) {
		Person.birthYear = birthYear;
	}

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		Person.birthYear = birthYear;
	}

	public int calculateAge() throws NumberFormatException, IOException {

		System.out.println("    CALCULATE THE AGE OF PERSON   ");
		System.out.println("Enter your birthYear: ");
		int birthYear = Integer.parseInt(br.readLine());
		int age = 2019 - birthYear;
		System.out.println();
		return age;
	}

	public String inputName() throws IOException {
		System.out.println("Enter your name: ");
		String name = br.readLine();
		return name;
	}

	public void info() throws IOException {
		int age = calculateAge();
		String name = inputName();
		
		System.out.println("name " + name + " age " + age);
	
		String newName = changeName();
		if (newName != null) {
			System.out.println( "name " + newName + " age " + age );
		} 
		
	}

	public String changeName() throws IOException {
		System.out.println("Enter your new name: ");
		String newName = br.readLine();
		return newName;

	}

	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.info();

	}

}
