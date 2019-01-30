
public class ContractEmployee extends Employee implements calc {
	public ContractEmployee(String employeeId,String name , int fixedPayment) {
		super(employeeId,name ,fixedPayment);
	}

	@Override
	public int calculatePay() {
		return getFixedPayment();
	}

}
