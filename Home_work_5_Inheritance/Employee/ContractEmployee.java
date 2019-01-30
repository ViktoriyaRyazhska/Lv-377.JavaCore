package Home_work_6_Inheritance.Employee;

public class ContractEmployee extends Employee implements CalculateSalary {

	// I am a fixed paid worker.

	private String federalTaxIdmember;
	private int fixedMonthlyPayment;

	public ContractEmployee(String federalTaxIdmember, String employeeld, String name, int fixedMonthlyPayment) {
		super(employeeld, name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public void calculatePay() {
		// "the average monthly salary = fixed monthly payment“
		setSalary(getFixedMonthlyPayment());
	}

}
