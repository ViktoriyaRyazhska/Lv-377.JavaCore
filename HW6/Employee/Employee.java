package hw62.softserve;

public abstract class Employee implements ICalculatePay {
	
	public abstract int calculatePay();
	
	private String employeeID;
	
	

	public Employee(String employeeID) {
				this.employeeID = employeeID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	


}
