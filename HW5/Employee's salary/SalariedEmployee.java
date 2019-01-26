
public class SalariedEmployee extends Employee implements CalculateSalaryForEmployee {
	private String socialSecurityNumber;
	private double fixedMonthlySalary;
	
	public SalariedEmployee(String name, String socialSecurityNumber, double fixedMonthlySalary) {
		super(name);
		this.setSocialSecurityNumber(socialSecurityNumber);
		this.setFixedMonthlySalary(fixedMonthlySalary);
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getFixedMonthlySalary() {
		return fixedMonthlySalary;
	}

	public void setFixedMonthlySalary(double fixedMonthlySalary) {
		this.fixedMonthlySalary = fixedMonthlySalary;
		calculatePay();
	}


	@Override
	public void calculatePay() {
		// the average monthly salary = fixed monthly payment
		this.setAverageMonthlySalary(fixedMonthlySalary);
	}

	@Override
	public String toString() {
		return "SalariedEmployee \t[Id= " + getId() + ", \tName= " + getName() + ",  \tAverage monthly wage= " + getAverageMonthlySalary() +"]\n";
	}
	
	

}
