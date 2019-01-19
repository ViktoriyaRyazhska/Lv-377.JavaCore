import java.util.Calendar;

public class Person {

	private String name;
	private int birthYear;
	
	//--------------------------------------------------------------------------------------------------

	Person (){}
	
	Person (String name, int birthYear){
	this.name = name;
	this.birthYear = birthYear;
	}
	
	//-------------------------------------------------------------------------------------------------
	
	private void setName(String name) {
		this.name = name;
	}
	
	private String getName() {
		return this.name;
	}
	
	private void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	private int getBirthYear() {
		return this.birthYear;
	}
	
	//-------------------------------------------------------------------------------------------------
	
	public void input (String name, int birthYear) {
		this.setName(name);
		this.setBirthYear(birthYear);
	}
	
	public void output() {
		System.out.println("Name: " + this.getName() + "\t Birth year: " 
							+ this.getBirthYear() + "\t Age = " + this.age());
	}

	private int age() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR) - this.birthYear;
	}
	
	public void changeName (String name) {
		this.setName(name);
	}
	
	
}
