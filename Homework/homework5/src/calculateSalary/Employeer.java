package calculateSalary;

public class Employeer {
	private String name;

	
	public Employeer() {
	}


	public Employeer(String name) {
		this.name = name;
	}


	public String getEmployeeld() {
		return name;
	}


	public void setEmployeeld(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employeer [name=" + name + "]";
	}
	
	

}
