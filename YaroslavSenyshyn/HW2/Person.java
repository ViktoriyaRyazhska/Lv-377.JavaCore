package day2HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String name;
	private int birthYear;
	
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
	
	public Person () throws IOException {
		this.input(this.name, this.birthYear);
		this.output(this.name, this.birthYear);
		System.out.print(this.output(this.name, this.birthYear));		
	}
	
	public Person (String name, int birthYear) throws IOException {
		this.name = name;
		this.birthYear = birthYear;
		System.out.print(this.output(this.name, this.birthYear));
	}
	public int age (int birhtYear) {
		return 2019-this.birthYear;
	}
	
	public void input (String name, int BirthYear) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Pleas input person name");
		this.name = br.readLine();
		System.out.println("Pleas input birth year");
		this.birthYear = Integer.parseInt(br.readLine());
		br.close();
	}
	
	public String output (String name, int BirthYear) {
		return this.toString();
	}

	public void changeName (String name) {
		this.setName(name);
	}
	
	@Override
	public String toString() {
		return "Person name: " + name + ", birth year: " + birthYear + ", age: " +this.age(getBirthYear())+ "    ";
	}	
}
