package calculateSalary;

public class SalariedEmployee extends Employeer implements Calculate{
	private int hourlyRate;
	private int hoursWorked;
	private String socialSecurityNumber;
	
	

	public SalariedEmployee(String name) {
		super(name);
	}


	public SalariedEmployee(String name, int hourlyRate, int hoursWorked, String socialSecurityNumber) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	

	public int getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	@Override
	public int calculatePay() {
		return  hourlyRate * hoursWorked;
	}


	@Override
	public String toString() {
		return "[hourlyRate=" + hourlyRate + ", hoursWorked=" + hoursWorked + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}
	

}
