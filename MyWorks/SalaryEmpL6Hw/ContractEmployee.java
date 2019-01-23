package SalaryEmpL6Hw;

public class ContractEmployee extends Employee implements Salary {

	public int federalTaxIdmember;

	public ContractEmployee(int employeeId, String name) {
		super(employeeId, name);
		this.employeeId = federalTaxIdmember;
	}

	
	public void calculatePay() {
		int fixedMonthlPayment = 8000;
		int monthlySalary = fixedMonthlPayment;
		System.out.println("MonthlySalary" + monthlySalary);
	}

}
