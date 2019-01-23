package OOPInheritanceHWEmployee;

public class Employee implements CalculatePay {

	private String employeeld;
	private String nameEmployee;
	
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public String getEmployeeld() {
		return employeeld;
	}
	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public Employee() {
	
	}

	@Override
	public int calculatePay() {
		return 0;
	
	
}

}