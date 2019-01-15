package Class_and_object;

public class Employee {

	String name;
	int rate;
	int hours;

	int salary;
	double bonuses;
	public static int totalSum;

	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee() {
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
		totalSum = totalSum - totalSalary();
		this.rate = rate;
		totalSum = totalSum + totalSalary();
	}

	public int getHours() {
		this.salary = this.rate * this.hours;
		return hours;
	}

	public void setHours(int hours) {
		totalSum = totalSum - totalSalary();
		this.hours = hours;
		totalSum = totalSum + totalSalary();
	}

	public int totalSalary() {
		salary = this.hours * this.rate;
		return salary;
	}

	public double bonuses() {
		bonuses = this.salary * 0.1;
		return bonuses;
	}

	@Override
	public String toString() {
		return "My name is " + this.name + " and my rate is " + this.rate + " and have worked " + this.hours + " hours.";
	}

}
