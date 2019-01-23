package OOPInheritanceHWEmployee;

public class EmployeeMain extends ContractEmployee{

	public static void main(String[] args) {
		Employee[] e = new Employee [4];
		e[0]= new SalariedEmployee("00213a", "Ivan Orel", "21q321", 3000);
		e[1]= new SalariedEmployee("00214a", "Anya Bereza", "00z354", 1900);
		e[2]= new ContractEmployee("00215a", "Petro Koleso", 00012, 15, 160);
		e[3]= new ContractEmployee("00216a", "Vasya Sonce", 00012, 13, 200);
///print		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		System.out.println();
///sort
		Employee t = new Employee();
		for (int i = 0; i < e.length-1; i++) {
			for (int j = i+1; j < e.length; j++) {
				if (e[i].calculatePay()>e[j].calculatePay()) {
					t=e[i];
					e[i]=e[j];
					e[j]=t;	
				}
			}
		}
///print		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		

	}

}
