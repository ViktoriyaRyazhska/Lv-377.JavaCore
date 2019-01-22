package Lesson6;

public abstract class Staff extends Person {
	
	public Staff(String name) {
		super(name);
	}

	void print(){
		System.out.println("I am " + name);	
	}
	
	abstract void salary();

}
