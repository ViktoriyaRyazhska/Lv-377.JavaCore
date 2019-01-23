package hw62.softserve;

public class ContractEmployee extends Employee implements ICalculatePay {
	
	private String name;
	private int pay;
	private int federalTaxNum;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getFederalTaxNum() {
		return federalTaxNum;
	}

	public void setFederalTaxNum(int federalTaxNum) {
		this.federalTaxNum = federalTaxNum;
	}
	
	

	public ContractEmployee(String employeeID, String name, int pay, int federalTaxNum) {
		super(employeeID);
		this.name = name;
		this.pay = pay;
		this.federalTaxNum = federalTaxNum;
	}

	public ContractEmployee(String employeeID) {
		super(employeeID);
		
	}

	@Override
	public int calculatePay() {
		return pay;
	}

	@Override
	public String toString() {
		return "ContractEmployee [ " + name + ", Pay: " + pay + ", federalTaxNum: " + federalTaxNum
				+ "Total Pay: " + calculatePay() + "]";
	}
	

}
