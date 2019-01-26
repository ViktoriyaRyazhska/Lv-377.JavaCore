package calculateSalary;


public class Main {

	public static void main(String[] args) {
			
		ContractEmployee contract1 = new ContractEmployee("Vasya", 1000, 11111);
		ContractEmployee contract2 = new ContractEmployee("Inna", 1000, 22222);
		ContractEmployee contract3 = new ContractEmployee("Kolya", 500, 33333);
		ContractEmployee contract4 = new ContractEmployee("Oksana", 1750, 44444);
		ContractEmployee contract5 = new ContractEmployee("Roman", 1200, 55555);
		SalariedEmployee salari1 = new SalariedEmployee("Olya", 30, 8, "olya1");
		SalariedEmployee salari2 = new SalariedEmployee("Andriy", 50, 8, "andriy1");
		SalariedEmployee salari3 = new SalariedEmployee("Oleg", 40, 8, "oleg1");
		SalariedEmployee salari4 = new SalariedEmployee("Anna", 45, 8, "anna1");
		SalariedEmployee salari5 = new SalariedEmployee("Igor", 45, 8, "igor1");
		
		Employeer[] mas = {contract1, contract2, contract3, contract4, contract5, salari1, salari2, salari3, salari4, salari5};
		Employeer x;
		for(int i=0; i < mas.length; i++) {
			for(int j=i+1; j<mas.length; j++) {
				if(mas[i] instanceof ContractEmployee && mas[j] instanceof ContractEmployee) {
					if(((ContractEmployee)mas[i]).calculatePay() < ((ContractEmployee)mas[j]).calculatePay()) {
						x = mas[i];
						mas[i] = mas[j];
						mas[j] = x;
					}
				}else if(mas[i] instanceof SalariedEmployee && mas[j] instanceof SalariedEmployee) {
					if(((SalariedEmployee)mas[i]).calculatePay() < ((SalariedEmployee)mas[j]).calculatePay()) {
						x = mas[i];
						mas[i] = mas[j];
						mas[j] = x;
					}
			}
		}

			if(mas[i] instanceof ContractEmployee) {
				System.out.println(mas[i].getEmployeeld() + " " +  ((ContractEmployee) mas[i]).calculatePay() + " " + ((ContractEmployee) mas[i]).getFederalTaxIdmember());
			}else if(mas[i] instanceof SalariedEmployee) {
				System.out.println(mas[i].getEmployeeld() + " " + ((SalariedEmployee)mas[i]).calculatePay() + " " + ((SalariedEmployee)mas[i]).getSocialSecurityNumber());
			}
		}
	}
	
}
