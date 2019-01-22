package OOPInheritance;

public class Cat implements Animal{

	@Override
	public void voice() {
		System.out.println("Cat can say - myav");
	}

	@Override
	public void feed() {
		System.out.println("Cat eat fish");
	}

}
