package SalaryEmpL6Hw;

public class ContractEmployee extends Employee implements Salary {
	
	public int federalTaxIdmember;
	
	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public ContractEmployee(String employeeId, String name, int federalTaxIdmember) {
		super(employeeId, name);
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public void calculatePay() {
		int fixedMonthlPayment = 8000;
		int monthlySalary = fixedMonthlPayment;
		System.out.println("MonthlySalary" + monthlySalary);
	}

}
