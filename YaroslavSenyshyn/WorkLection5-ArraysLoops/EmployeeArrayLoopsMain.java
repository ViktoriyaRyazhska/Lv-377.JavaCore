package dayArrayLoops;

import java.util.Scanner;

public class EmployeeArrayLoopsMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeArrayLoops [] emArray = EmployeeArrayLoops.employeeArray(5, sc);

		EmployeeArrayLoops.output(emArray);
		EmployeeArrayLoops.sort(emArray);		
		EmployeeArrayLoops.output(emArray);
		EmployeeArrayLoops.find(emArray, 2);	
		
		sc.close();
	}
}
