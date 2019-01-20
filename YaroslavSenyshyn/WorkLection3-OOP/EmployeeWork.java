package day2;

public class EmployeeWork {

	public static void main(String[] args) {
		Employee w = new Employee();
		w.setName("Vasya");
		w.setRate(10);
		w.setHour(8);

		Employee w1 = new Employee(10, 10);
		w1.setName("Petya");

		Employee w2 = new Employee("Ivan", 11, 10);

		System.out.println(w);
		System.out.println(w1);
		System.out.println(w2);

		System.out.println("Total Summ: " + Employee.totalSum);

		w1.setHour(1);
		System.out.println("Total Summ: " + Employee.totalSum);
		w1.setRate(1);
		System.out.println("Total Summ: " + Employee.totalSum);
	}

}
