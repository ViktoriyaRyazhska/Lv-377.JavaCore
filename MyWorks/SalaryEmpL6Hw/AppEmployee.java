package SalaryEmpL6Hw;

public class AppEmployee {

	public static void main(String[] args) {
		
		Employee[] employee = new Employee[4];
		employee[0]=new SalariedEmployee(22, "Alex");
		employee[1]=new ContractEmployee(21, "John");
		employee[2]=new SalariedEmployee(20, "Sem");
		employee[3]=new ContractEmployee(25, "Bob");
		
		
		for(int k=0; k<employee.length; k++) {
			employee[k].calculatePay();
			
		}
			
			
			Employee tmp;
			for(int i=0; i<employee.length-1; i++) {
				
				for (int j = i + 1; j < employee.length; j++) {
					if (employee[i].getEmployeeId() < employee[j].getEmployeeId()) {
						tmp = employee[i];
						employee[i] = employee[j];
						employee[j] = tmp;

					}
				}
			}
			
			for (int i = 0; i < employee.length; i++) {
				System.out.println(employee[i]);
			}
			
		}

}


