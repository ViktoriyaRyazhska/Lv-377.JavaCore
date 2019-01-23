package OOPInheritanceHWEmployee;

public class SalariedEmployee extends Employee{
	private String socialSecurityNumber;
	private int fixedMonthlyPayment;
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}
	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	public SalariedEmployee(String employeeld, String nameEmployee, String socialSecurityNumber, int fixedMonthlyPayment) {
		setEmployeeld(employeeld);
		setNameEmployee(nameEmployee);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
	
	@Override
	public int calculatePay() {
		return getFixedMonthlyPayment();
	}
	
	
	@Override
	public String toString() {
		return "ID " + getEmployeeld() + "; Name: " + getNameEmployee()+", monthly payment: "
				+ getFixedMonthlyPayment();
	}

}
