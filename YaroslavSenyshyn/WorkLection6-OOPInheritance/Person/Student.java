package OOPInheritance;

public class Student extends Person {
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	@Override
	public void print() {
		System.out.println("I am students "+getName());
	}
	
}
