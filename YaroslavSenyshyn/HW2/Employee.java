package day2;

public class Employee {
	private String name;
	private int rate;
	private int hour;
	public static int totalSum;
		
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
		totalSum = totalSum - Sallary();
		this.rate = rate;
		totalSum = totalSum + Sallary();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		totalSum = totalSum - Sallary();
		this.hour = hour;
		totalSum = totalSum + Sallary();
	}

	public static int getTotalSum() {
		return totalSum;
	}

	
	public Employee () {}
	
	public Employee (int rate, int hour) {
		this.rate = rate;
		this.hour = hour;
		totalSum = totalSum + Sallary();
	}
	
	public Employee (String name, int rate, int hour) {
		this.name = name;
		this.rate = rate;
		this.hour = hour;
		totalSum = totalSum + Sallary();
	}

	
 	public int Sallary () {
		return rate*hour;
	}

	@Override
	public String toString() {
		return "Employee (name=" + name + ", rate=" + rate + ", hour=" + hour + ")";
	}	
	
}
