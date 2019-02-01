package HW6;

public class SalariedEmployee extends Employee implements Pay {
	private String name;
	private double salary;
	private String socialSecurityNumber;
	private int hours;
	
	public SalariedEmployee() {
		
	}
	
	public SalariedEmployee(String name) {
		this.name = name;
	}
	
	public SalariedEmployee(String name, String number) {
		this.name = name;
		this.employeeId = number;
	}
	
	public SalariedEmployee(String name, String number, double salary) {
		this.name = name;
		this.employeeId = number;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
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

	@Override
	public double calculatePay() {
		return this.salary*this.hours;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + name + ", salary=" + this.calculatePay() + ", employeeId=" + this.employeeId + "]";
	}
	
}
