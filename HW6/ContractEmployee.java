package HW6;

public class ContractEmployee extends Employee implements Pay {
	private String name;
	private double salary;
	private String federalTaxIdmember;
	
	public ContractEmployee() {
		
	}
	
	public ContractEmployee(String name) {
		this.name = name;
	}
	
	public ContractEmployee(String name, String number) {
		this.name = name;
//		this.setEmployeeId(number);
		this.employeeId = number;
	}
	
	public ContractEmployee(String name, String number, double salary) {
		this.name = name;
		this.employeeId = number;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public double calculatePay() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "ContractEmployee [name=" + name + ", salary=" + this.calculatePay() + ", employeeId=" + this.employeeId + "]";
	}
	
}