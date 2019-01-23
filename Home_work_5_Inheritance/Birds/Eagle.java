package Home_work_5_Inheritance_Birds;

public class Eagle extends FlyingBird {

	public Eagle() {
		setGroup("Eagle");
		setFeathers("brown feathers.");
	}

	@Override
	public void feathers() {
		System.out.println("I have " + getFeathers());
	}
}
