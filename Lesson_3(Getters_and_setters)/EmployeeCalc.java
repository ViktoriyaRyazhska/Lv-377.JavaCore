package Class_and_object;

public class EmployeeCalc {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Petro", 23, 45);
		Employee employee2 = new Employee("Pavlo", 34);
		employee2.setHours(33);
		Employee employee3 = new Employee();
		employee3.setName("Vasyl");
		employee3.setRate(27);
		employee3.setHours(45);
		
		Employee[] array = {employee1, employee2, employee3};
		for (Employee allEmployee : array) {
			System.out.println(allEmployee.toString());
			System.out.println("My salary is " + allEmployee.totalSalary() + " and my bonuses are " + allEmployee.bonuses());
		}
		
		System.out.println("The total sum is " + Employee.totalSum);
		

	}

}
