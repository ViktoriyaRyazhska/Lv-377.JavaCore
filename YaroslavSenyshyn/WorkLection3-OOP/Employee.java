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
		totalSum = totalSum - (Sallary() + Bonus());
		this.rate = rate;
		Sallary();
		Bonus();
		totalSumm();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		totalSum = totalSum - (Sallary() + Bonus());
		this.hour = hour;
		Sallary();
		Bonus();
		totalSumm();
	}

	public Employee() {
	}

	public Employee(int rate, int hour) {
		this.rate = rate;
		this.hour = hour;
		totalSumm();
	}

	public Employee(String name, int rate, int hour) {
		this.name = name;
		this.rate = rate;
		this.hour = hour;
		totalSumm();
	}

	public int Sallary() {
		return rate * hour;
	}

	public int Bonus() {
		return Sallary() / 10;
	}

	public void totalSumm() {
		totalSum = totalSum + Sallary() + Bonus();
	}

	@Override
	public String toString() {
		return "Employee (name=" + name + ", rate=" + rate + ", hour=" + hour + ")";
	}

}
