package dayArrayLoops;

import java.util.Scanner;

public class EmployeeArrayLoops {
	private String name;
	private int departmentNumber;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//constructor	
	public EmployeeArrayLoops(String name, int departmentNumber, double salary) {
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}
//input info about worker array with loop
	public static EmployeeArrayLoops[] employeeArray(int quantityWorker, Scanner sc) {
		
	EmployeeArrayLoops[] em = new EmployeeArrayLoops[quantityWorker];
	String name;
	
	for (int i = 0; i < em.length; i++) {
		System.out.println("Input name worker "+(i+1)+": ");
		name = sc.nextLine();
		System.out.println("Input department number worker "+(i+1)+": ");
		int departmentNumber = Integer.parseInt(sc.nextLine());
		System.out.println("Input salary worker "+(i+1)+": ");
		double salary = Double.parseDouble(sc.nextLine());
		em[i] = new EmployeeArrayLoops(name,departmentNumber,salary);	
	}	
	return em;
}	
//find worker for current department
	public static void find(EmployeeArrayLoops[] em, int quantity) {
		System.out.println("Worker with department "+quantity);
		for (int i = 0; i < em.length; i++) {
			if (em[i].getDepartmentNumber() == quantity) {
				System.out.println(em[i]);
			}
		}
	}
//sort worker with small to bigger salary
	public static void sort(EmployeeArrayLoops[] em) {
		System.out.println("Sort");
		EmployeeArrayLoops[] temp = new EmployeeArrayLoops[1];
		for (int i = 0; i < em.length - 1; i++) {
			for (int j = i + 1; j < em.length; j++) {

				if (em[i].getSalary() > em[j].getSalary()) {
					temp[0] = em[i];
					em[i] = em[j];
					em[j] = temp[0];

				}
			}
		}
	}
//output all info about all worker
	public static void output(EmployeeArrayLoops[] em) {
		System.out.println("Info about all worker: ");
		for (int i = 0; i < em.length; i++) {
			System.out.println(em[i]);
		}
		
	}	
//override toString
	@Override
	public String toString() {
		return "Name: " + name + ", Department Number: " + departmentNumber + ", Salary: " + salary;
	}
}
