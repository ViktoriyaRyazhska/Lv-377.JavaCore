package hw62.softserve;

public class MainEmployee {

	public static void main(String[] args) {
		
		Employee [] emp = new Employee [5];
		emp [0] = new SalariedEmployee("SE1", "Zurab Afanasiyovich", 20, 53, 1234567);
		emp [1] = new SalariedEmployee("SE2", "Petro Azazelovich", 18, 53, 1234568);
		emp [2] = new SalariedEmployee("SE3", "Lazar Nikiforovich", 24, 50, 1244567);
		emp [3]	= new ContractEmployee("CE1", "Sigizmund Petrovich", 15000, 1234987);
		emp [4]	= new ContractEmployee("CE2", "Gervaziy Naumovich", 5000, 1434487);
		
		
		Employee tmp;
				
		for (int i = 0; i < emp.length -1 ; i++) {
			for (int j = i + 1; j <emp.length; j++) {
				if (emp[i].calculatePay() < emp[j].calculatePay()){
					tmp = emp[i];
					emp[i] = emp[j];
					emp[j] = tmp;
				}
			}
		
		}
		
		System.out.println("Employees sorted by vages in descend: ");
		
		for (int i = 0; i < emp.length; i++){	
			System.out.println(emp[i]);
		}

	}

}
