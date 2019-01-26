
public class ContractEmployee extends Employee implements CalculateSalaryForEmployee {
	private String federalTaxIdmember;
	private int hourlyRate;
	private int numOfHoursWorked;
	
	public ContractEmployee(String name, String federalTaxIdmember, int hourlyRate, int numOfHoursWorked) {
		super(name);
		setFederalTaxIdmember(federalTaxIdmember);
		setHourlyRate(hourlyRate);
		setNumOfHoursWorked(numOfHoursWorked);
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}


	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
		calculatePay();
	}


	public int getNumOfHoursWorked() {
		return numOfHoursWorked;
	}

	public void setNumOfHoursWorked(int numOfHoursWorked) {
		this.numOfHoursWorked = numOfHoursWorked;
		calculatePay();
	}

	
	@Override
	public void calculatePay() {
		// "the average monthly salary = hourly rate * number of hours worked“
		setAverageMonthlySalary(this.hourlyRate * this.numOfHoursWorked);;
	}

	@Override
	public String toString() {
		return "ContractEmployee \t[Id= " + getId() + ", \tName= " + getName() + ", \tAverage monthly wage= " + getAverageMonthlySalary() +  "]\n";
	}
	
	
}
