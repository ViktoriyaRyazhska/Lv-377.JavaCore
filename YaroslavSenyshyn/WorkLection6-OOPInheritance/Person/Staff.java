package OOPInheritance;

public abstract class Staff extends Person {
	public abstract int Sallary();
	
	@Override
	public void print() {
		System.out.print("I am staff");
	}
	
}
