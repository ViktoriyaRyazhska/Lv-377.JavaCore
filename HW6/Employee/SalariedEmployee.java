package hw62.softserve;

public class SalariedEmployee extends Employee implements ICalculatePay {
	
	
	private String name;
	private int hourPay;
	private int hours;
	private int socialSecNum;
	
	
	
	public SalariedEmployee(String employeeID, String name, int hourPay, int hours, int socialSecNum) {
		super(employeeID);
		this.name = name;
		this.hourPay = hourPay;
		this.hours = hours;
		this.socialSecNum = socialSecNum;
	}

	public SalariedEmployee(String employeeID) {
		super(employeeID);
		
	}

	@Override
	public int calculatePay() {
		int s = getHourPay() * getHours();
		return s;
		
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHourPay() {
		return hourPay;
	}

	public void setHourPay(int hourPay) {
		this.hourPay = hourPay;
	}

	public int getSocialSecNum() {
		return socialSecNum;
	}
	
	

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setSocialSecNum(int socialSecNum) {
		this.socialSecNum = socialSecNum;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [ " + name + ", hourPay: " + hourPay + ", hours: " + hours + ", socialSecNum:"
				+ socialSecNum + ", Total Pay: " + calculatePay() + "]";
	}

}
