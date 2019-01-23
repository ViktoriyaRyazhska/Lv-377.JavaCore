package Home_work_5_Inheritance_Birds;

public class Penguin extends NonFlyingBird {

	public Penguin() {
		setGroup("Penguin");
		setFeathers("white and black feathers.");
	}

	@Override
	public void feathers() {
		System.out.println("I have " + getFeathers());
	}

}
