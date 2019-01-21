package employeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Employeer[] empl = {new Employeer("Vasya", 1, 300), new Employeer("Kolya", 3, 600), new Employeer("Ira", 2, 500), new Employeer("Olya", 3, 800), new Employeer("Petya", 1, 400)};
		
			System.out.println("Input department number : ");
			int numDep = Integer.valueOf(bf.readLine());
			Employeer x = new Employeer();
		for(int i = 0; i < empl.length; i++) {	

			for(int j = i+1; j < empl.length; j++) {
				if(empl[i].getSalary() < empl[j].getSalary()) {
					x = empl[i];
					empl[i] = empl[j];
					empl[j] = x;
				}	
			}
			System.out.println("3 " + empl[i]);
			if(numDep == empl[i].getDepartmentNumber()) {
		System.out.println("1 " + empl[i]);
		}
		}		
	}

}
