package SalaryEmpL6Hw;

public abstract class Employee implements Salary {
	protected int employeeId;
	protected String name;

	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

	public Employee(int employeeId, String name) {

		this.employeeId = employeeId;
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
