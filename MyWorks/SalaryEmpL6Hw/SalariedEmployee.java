package SalaryEmpL6Hw;

public class SalariedEmployee extends Employee implements Salary {

	public int socialSecurityNumber;

	public SalariedEmployee(int employeeId, String name) {
		super(employeeId, name);
		this.employeeId = socialSecurityNumber;
	}
	

	public void calculatePay() {
		int hourlyRate = 20, numberOfHours = 160;
		int monthlySalary = hourlyRate * numberOfHours;
		System.out.println("MonthlySalary" + monthlySalary);

	}
}
