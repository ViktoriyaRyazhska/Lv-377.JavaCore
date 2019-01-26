package SalaryEmpL6Hw;

public class SalariedEmployee extends Employee implements Salary {

	public int socialSecurityNumber;

	public SalariedEmployee(String employeeId, String name, int socialSecurityNumber) {
		super(employeeId, name);
		this.socialSecurityNumber = socialSecurityNumber;
	}

	

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public void calculatePay() {
		int hourlyRate = 20, numberOfHours = 160;
		int monthlySalary = hourlyRate * numberOfHours;
		System.out.println("MonthlySalary " +monthlySalary);

	}
}
