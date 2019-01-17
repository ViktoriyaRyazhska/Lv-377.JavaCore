package Lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Employee {
	
	private int departamentNumber;
	private int salary;
	private String name;
	

	public int getDepartamentNumber() {
		return departamentNumber;
	}


	public void setDepartamentNumber(int departamentNumber) {
		this.departamentNumber = departamentNumber;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(int departamentNumber, int salary, String name) {
		super();
		this.departamentNumber = departamentNumber;
		this.salary = salary;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Employee [departamentNumber=" + departamentNumber + ", salary=" + salary + ", name=" + name + "]";
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 Employee[] employee= {
			new Employee(1, 1400, "Semenko"),
			new Employee(2, 900, "Petrenko"),
			new Employee(3, 1100, "Oleksiuk"),
			new Employee(3, 1200, "Stepanko"),
			new Employee(2, 850, "Gnat")
			
		};
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the number of department: ");
//		int number = Integer.parseInt(br.readLine());
//		
//		int i=0;
//		while (i < employee.length) {
//			if (employee[i].getDepartamentNumber() == number) {
//				System.out.println(employee[i]);
//			}
//			i++;
//		}
//		
//		int k=0;
//		while (k < employee.length) {
//			if (employee[k].salary == number) {
//				System.out.println(employee[k]);
//			}
//			i++;
//		}
		 
		
		float tmp;
		for (int t = 0; t < employee.length-1; t++) {
			for (int j = t+1; j < employee.length; j++) {
				if (employee[t].getSalary() < employee[j].getSalary()) {
					tmp = employee[t].getSalary();
					float tf =employee[t].getSalary();
					float jf =employee[j].getSalary();
					tf=jf;
					jf= tmp;
				}
			}
		}
		
		for (int t = 0; t < employee.length; t++) {
			System.out.println(employee[t]);
		}


	
		

	}

}
