package calculateSalary;

public class ContractEmployee extends Employeer implements Calculate{
	private int fixedMonthlyPayment;
	private int federalTaxIdmember;
	
	

	public ContractEmployee(String name) {
		super(name);
	}



	public ContractEmployee(String name, int fixedMonthlyPayment, int federalTaxIdmember) {
		super(name);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		this.federalTaxIdmember = federalTaxIdmember;
	}



	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}



	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}



	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}



	@Override
	public int calculatePay() {
		return fixedMonthlyPayment;
	}



	@Override
	public String toString() {
		return "[fixedMonthlyPayment=" + fixedMonthlyPayment + ", federalTaxIdmember=" + federalTaxIdmember + "]" ;
	}

	
}
