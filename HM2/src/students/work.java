package students;

public class work {
	private String name;
	private int rate;
	private int hours;

	private static int totalSum = 0;

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
		totalSum = totalSum - salary();
		this.rate = rate;
		totalSum += salary();
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		totalSum -= salary();
		this.hours = hours;		
		totalSum += salary();

	}

	public work(String name, int rate, int hours) {
		this.hours = hours;
		this.name = name;
		this.rate = rate;
		totalSum += salary();


	}

	public work(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public work() {
	}

	@Override
	public String toString() {
		return "info [name=" + getName() + ", rate=" + getRate() + ", hours=" + getHours() + "]";
	}

	public int salary() {
		return rate * hours;
	}

	public double bonuses() {
		return ((salary() * 10.0) / 100) + salary();
	}
	
	public static double getTotalSum() {
		return totalSum *1.1;
	}
	

}
