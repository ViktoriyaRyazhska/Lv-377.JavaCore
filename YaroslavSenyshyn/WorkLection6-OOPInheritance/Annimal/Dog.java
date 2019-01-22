package OOPInheritance;

public class Dog implements Animal {

	@Override
	public void voice() {
		System.out.println("Dog can say - hav");
		
	}

	@Override
	public void feed() {
		System.out.println("Dog eat chicken");
		
	}

}
