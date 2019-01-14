package employee;

public class Main {

	public static void main(String[] args) {

		Employee Vasya = new Employee("Vasya", 8, 8);
		Employee Kolya = new Employee("Kolya", 5, 8);
		Employee Olya = new Employee("Olya", 5, 8);

		System.out.println(Vasya);
		System.out.println(Kolya);
		System.out.println(Olya);
		System.out.println("Salary Vasya " + Vasya.Salary());
		System.out.println("Salary Kolya " + Kolya.Salary());
		System.out.println("Salary Olya " + Olya.Salary());
		System.out.println("Bonuss Vasya : " + Vasya.Bonuses(Vasya.Salary()));
		System.out.println("Bonuss Kolya : " + Kolya.Bonuses(Kolya.Salary()));
		System.out.println("Bonuss Olya : " + Olya.Bonuses(Olya.Salary()));

		System.out.println("Students : " + Employee.count);
		System.out.println("TotalSum : " + Employee.totalSum);
	}

}
