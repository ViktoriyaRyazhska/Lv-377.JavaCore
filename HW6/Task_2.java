package HW6;

public class Task_2 {
	public static void main(String[] args) {
		Employee[] workers = {
				new ContractEmployee("Jo", "AB001", 105.5),
				new SalariedEmployee("Ki", "GH102", 23.6),
				new ContractEmployee("Hu", "AB002", 100.3),
				new SalariedEmployee("Ku", "GH326", 30.1),
				new ContractEmployee("Ya", "AB003", 150.5),
				new SalariedEmployee("Ko", "GH986", 20.4)
		};
		
		for (int i = 0; i < workers.length; i++) {
//			if (workers[i].getClass() == SalariedEmployee.class) {
//				((SalariedEmployee)workers[i]).setHours(5);
//			}
			if (workers[i] instanceof SalariedEmployee) {
				((SalariedEmployee)workers[i]).setHours(5);
			}
		}
		
		for (int i = 0; i < workers.length; i++) {
			System.out.println(workers[i]);
		}
		
		System.out.println("");
		
		Employee tmp = null;
		for (int i = 0; i < workers.length - 1; i++) {
			for (int j = i + 1; j < workers.length; j++) {
				
				double salary1 = (workers[i] instanceof SalariedEmployee) ? ((SalariedEmployee)workers[i]).calculatePay() : ((ContractEmployee)workers[i]).calculatePay();
				double salary2 = (workers[j] instanceof SalariedEmployee) ? ((SalariedEmployee)workers[j]).calculatePay() : ((ContractEmployee)workers[j]).calculatePay();
				
//				if (workers[i] instanceof SalariedEmployee) {
//					salary1 = ((SalariedEmployee)workers[i]).calculatePay();
//				} else {
//					salary1 = ((ContractEmployee)workers[i]).calculatePay();
//				}
//					
//				if (workers[j] instanceof SalariedEmployee) {
//					salary2 = ((SalariedEmployee)workers[j]).calculatePay();
//				} else {
//					salary2 = ((ContractEmployee)workers[j]).calculatePay();
//				}
				
				if (salary1 < salary2) {
					tmp = workers[i];
					workers[i] = workers[j];
					workers[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < workers.length; i++) {
			System.out.println(workers[i]);
		}
		
	}
}