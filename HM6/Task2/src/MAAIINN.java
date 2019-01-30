

public class MAAIINN {
	public static void main(String[] args) {
		Employee[] e = new Employee[4];
		e[0]= new SalariedEmployee("1", "Gosha", 120, 35);
		e[1]= new ContractEmployee("2", "Petro", 5000);
		e[2]= new SalariedEmployee("3", "Dmitro", 200, 40);
		e[3]= new ContractEmployee("4", "Volodya", 6000);
		for(int i = 0; i<e.length;i++) {
			if(e[i] instanceof calc)
			System.out.println("ID :"+e[i].getEmployeeId()+"| Name : "+e[i].getName()+"| Average monthly wage : "+((calc)e[i]).calculatePay()+";"); 
		}
	}
}
