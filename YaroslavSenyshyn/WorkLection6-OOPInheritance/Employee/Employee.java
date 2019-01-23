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
//Create an interface to the method calculatePay(), the base class Employee with 
//a string variable employeeld. 
//Create two classes SalariedEmployee and ContractEmployee, which implement interface and 
//are inherited from the base class. 
//Describe hourly paid workers in the relevant classes (one of the children), and 
//fixed paid workers (second child). 
//Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//Include a description of federalTaxIdmember in the class of ContractEmployee .
//The calculation formula for the "time-worker“ is: 
//"the average monthly salary = hourly rate * number of hours worked“
//For employees with a fixed payment the formula is: 
//"the average monthly salary = fixed monthly payment“
//Create an array of employees and add the employees with different form of payment.
//Arrange the entire sequence of workers descending the average monthly wage. 
//Output the employee ID, name, and the average monthly wage for all elements of the list.
