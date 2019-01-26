package animal;

public class Dog implements Animal{
	private String name;

	public Dog() {
		super();
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	@Override
	public void voice() {
		System.out.println("Gay");
	}

	@Override
	public void feed() {
		System.out.println("Dog food");
	}
	
	

}
