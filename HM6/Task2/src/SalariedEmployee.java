
public class SalariedEmployee extends Employee implements calc{
	public SalariedEmployee(String employeeId,String name, int hour, int rating) {
		super(employeeId,name, hour, rating);
		
	}

	@Override
	public int calculatePay() {
		
		return getHour()*getRating();
	}

}
