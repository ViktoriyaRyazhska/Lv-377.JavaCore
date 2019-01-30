package Home_work_6_Inheritance.Employee;

public class Main {

	public static void main(String[] args) {

		// Create an interface to the method calculatePay(),
		// the base class Employee with a string variable employeeld.
		// Create two classes SalariedEmployee and ContractEmployee,
		// which implement interface and are inherited from the base class.
		// Describe hourly paid workers in the relevant classes (one of the children),
		// and fixed paid workers (second child).
		// Describe the string variable socialSecurityNumber in the class
		// SalariedEmployee .
		// Include a description of federalTaxIdmember in the class of ContractEmployee.
		// The calculation formula for the "time-worker“ is: "the average monthly salary
		// = hourly rate * number of hours worked“
		// For employees with a fixed payment the formula is: "the average monthly
		// salary = fixed monthly payment“
		// Create an array of employees and add the employees with different form of
		// payment.
		// Arrange the entire sequence of workers descending the average monthly wage.
		// Output the employee ID, name, and the average monthly wage for all elements
		// of the list.

		Employee[] array = new Employee[7];
		array[0] = new SalariedEmployee("6544092", "67", "Ostap", 145, 20);
		array[1] = new ContractEmployee("9798", "36", "Olga", 12000);
		array[2] = new SalariedEmployee("6876086", "99", "Svitlana", 156, 23);
		array[3] = new ContractEmployee("7567", "17", "Matvij", 17560);
		array[4] = new SalariedEmployee("1127868", "23", "Denus", 167, 19);
		array[5] = new ContractEmployee("3456", "75", "Natalia", 20170);
		array[6] = new SalariedEmployee("9077322", "87", "Solomia", 134, 27);

		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof ContractEmployee) {
				((ContractEmployee) array[i]).calculatePay();
			} else {
				((SalariedEmployee) array[i]).calculatePay();
			}
		}

		Employee temporaryVariable;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].getSalary() > array[j].getSalary()) {
					temporaryVariable = array[i];
					array[i] = array[j];
					array[j] = temporaryVariable;
				}

			}
			System.out.println(array[i]);

			if (array[i] instanceof SalariedEmployee) {
				System.out.println("Social number " + ((SalariedEmployee) array[i]).getSocialSecurityNumber());
			} else {
				System.out.println("Federal number " + ((ContractEmployee) array[i]).getFederalTaxIdmember());
			}

		}
	}
}
