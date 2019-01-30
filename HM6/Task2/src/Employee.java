
public class Employee {
	private String employeeId;
	private String name;
	private int hour;
	private int rating;
	private int fixedPayment;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getFixedPayment() {
		return fixedPayment;
	}

	public void setFixedPayment(int fixedPayment) {
		this.fixedPayment = fixedPayment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String employeeId, String name, int fixedPayment) {
		this.employeeId = employeeId;
		this.name = name;
		this.fixedPayment = fixedPayment;
	}

	public Employee(String employeeId, String name, int hour, int rating) {

		this.employeeId = employeeId;
		this.name = name;
		this.hour = hour;
		this.rating = rating;
	}

	

	

}
