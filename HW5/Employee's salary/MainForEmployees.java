import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainForEmployees {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new ContractEmployee("Valera", "VA-354", 37, 160));
		employees.add(new ContractEmployee("Fedir", "FE-963", 80, 210));
		employees.add(new SalariedEmployee("Viktor", "333 222 77 66", 16_648));
		employees.add(new SalariedEmployee("Roman", "322 770 44 55", 17_777));
		
		System.out.println(employees);
		
		Collections.sort(employees);
		System.out.println(employees);
	}
	
}
