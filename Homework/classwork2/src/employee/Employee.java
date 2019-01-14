package employee;

public class Employee {
	private String name;
	private int rate;
	private int hours;
	
	public static int totalSum=0;
	public static int count;
	
	
	public Employee() {
		count++;
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
		count++;
	}

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + rate*hours;
		count++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		totalSum = totalSum - this.Salary();
		this.rate = rate;
		totalSum = totalSum + Salary();
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		totalSum = totalSum - this.Salary();
		this.hours = hours;
		totalSum = totalSum + this.Salary();
	}
	
	public int Salary() {
		return this.rate * this.hours;
	}
	
	public double Bonuses(int Salary) {
		return Salary()*10.0/100;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	
	

}
