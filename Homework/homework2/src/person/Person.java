 package person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String name;
	private int birthYear;
	
	public Person() {
		
	}
	
	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
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
	public int Age() {
		return (2019 - birthYear);
	}
	
	public void input() throws IOException {
		System.out.println("new person : ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input name :");
		name = String.valueOf(bf.readLine());
		System.out.println("Input birthYear :");
		birthYear = Integer.valueOf(bf.readLine());
	}
	
	public void changeName() throws IOException {
		this.name = null;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input new name :");
		name = String.valueOf(bf.readLine());
	}

	@Override
	public String toString() {
		return "[name=" + name + ", birthYear=" + birthYear 
				+ ", Age=" + Age() + "]";
	}
	
	
	
}
