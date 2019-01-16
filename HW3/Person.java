package hw2.softserve;

import java.util.Calendar;

public class Person {
	private String name;
	private int birthYear;
	
	//Getters and setters
	
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
	
	//Constructors
	
	public Person(String name, int birthYear) {
		
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public Person() {
	
	}
	
	//Це нагуглив, але з ним правильніше =)
	
	Calendar now = Calendar.getInstance();
	 int year = now.get(Calendar.YEAR);
	 
	 // calculating age..
	 
	int age(){
		return year - birthYear;
	}
	
	//change name
	public void changePersonsName(String name) {
		this.name = name;
}
	
	//Output
	@Override
	public String toString() {
		return "Person  " + name + ", birthYear: " + birthYear + ", age: " + age();
	}
	
	

}
