package Home_work_6_Inheritance.Employee;

public class Employee {

	private String employeeld;
	private String name;
	private int salary;

	public Employee(String employeeld, String name) {
		this.employeeld = employeeld;
		this.name = name;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee employeeld = " + employeeld + ", name = " + name + ", salary = " + salary;
	}
	
}