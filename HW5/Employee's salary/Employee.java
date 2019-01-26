
public abstract class Employee implements Comparable<Employee> {

	private double averageMonthlySalary;
	private int id;
	private String name;
	private static int unique = 0;

	public Employee() {
		this.id = this.getUnique();
		this.setName("noname");
	}

	public Employee(String name) {
		this.id = this.getUnique();
		this.setName(name);
	}

	public double getAverageMonthlySalary() {
		return averageMonthlySalary;
	}

	public void setAverageMonthlySalary(double averageMonthlySalary) {
		this.averageMonthlySalary = averageMonthlySalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnique() {
		return ++unique;
	}

	@Override
	public int compareTo(Employee that) {
		if (this.getAverageMonthlySalary() > that.averageMonthlySalary) {
			return -1;
		} else if (this.getAverageMonthlySalary() < that.averageMonthlySalary) {
			return 1;
		} else {
			return 0;
		}
	}

}
