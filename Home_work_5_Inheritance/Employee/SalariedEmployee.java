package Home_work_6_Inheritance.Employee;

public class SalariedEmployee extends Employee implements CalculateSalary {

	// I am a hourly paid worker.

	private String socialSecurityNumber;
	private int hours;
	private int rate;

	public SalariedEmployee(String socialSecurityNumber, String employeeld, String name, int hours, int rate) {
		super(employeeld, name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hours = hours;
		this.rate = rate;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public void calculatePay() {
		// "the average monthly salary = hourly rate * number of hours worked“
		setSalary(getHours() * getRate());
	}

}
