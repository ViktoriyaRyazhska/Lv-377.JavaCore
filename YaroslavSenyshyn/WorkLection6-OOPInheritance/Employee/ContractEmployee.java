package OOPInheritanceHWEmployee;

public class ContractEmployee extends Employee{
	private int federalTaxIdmember;
	private int hourlyRate;
	private int hoursWorked;
	
	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
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

	
	public ContractEmployee () {}

	public ContractEmployee(String employeeld, String nameEmployee, int federalTaxIdmember, int hourlyRate, int hoursWorked) {
		setEmployeeld(employeeld);
		setNameEmployee(nameEmployee);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public int calculatePay() {
		return getHourlyRate()*getHoursWorked();
	}
	
	@Override
	public String toString() {
		return "ID " + getEmployeeld() + "; Name: " + getNameEmployee()+", monthly payment: "
				+ calculatePay();
	}

	
}
