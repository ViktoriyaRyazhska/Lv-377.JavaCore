package SalaryEmpL6Hw;

public class AppEmployee {

	public static void main(String[] args) {

		Employee[] employee = { new SalariedEmployee("845", "Alex", 14), new ContractEmployee("802", "John", 18),
				new SalariedEmployee("741", "Sem", 12), new ContractEmployee("754", "Bob", 8) };

		for (int k = 0; k < employee.length; k++) {
			if (employee[k] instanceof SalariedEmployee) {
				System.out.println("Employee Id " + employee[k].getEmployeeId() + " Employee name "
						+ employee[k].getName() + " Social security number "
						+ ((SalariedEmployee) employee[k]).getSocialSecurityNumber());
				employee[k].calculatePay();

			} else {
				System.out.println(
						"Employee Id " + employee[k].getEmployeeId() + " Employee name " + employee[k].getName()
								+ " Federal taxId member " + ((ContractEmployee) employee[k]).getFederalTaxIdmember());
				employee[k].calculatePay();

			}

		}

	}

}
// Create an interface to the method calculatePay(), the base class Employee
// with a string variable employeeld.
// Create two classes SalariedEmployee and ContractEmployee, which implement
// interface and are inherited from the base class.
// Describe hourly paid workers in the relevant classes (one of the children),
// and fixed paid workers (second child).
// Describe the string variable socialSecurityNumber in the class
// SalariedEmployee .
// Include a description of federalTaxIdmember in the class of ContractEmployee
// .
// The calculation formula for the "time-worker“ is: "the average monthly salary
// = hourly rate * number of hours worked“
// For employees with a fixed payment the formula is: "the average monthly
// salary = fixed monthly payment“
// Create an array of employees and add the employees with different form of
// payment.
// Arrange the entire sequence of workers descending the average monthly wage.
// Output the employee ID, name,
// and the average monthly wage for all elements of the list.
